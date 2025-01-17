package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDAO {
  /**
   * 계좌이체 기능 구현
   * */
	public void transfer(String inputAccount, String outputAccount, int money) 
	{	
		Connection con = null;
		try
		{	
			con = DbManager.getConnection();
			con.setAutoCommit(false);  						//오토커밋을 꺼야함
			
			//인출하기
			
			int result = this.withdraw(con, outputAccount, money);		//Connection은 오토커밋이라 오토커밋을 해지해줘야함.
			if(result == 0)
			{
				throw new SQLException("출금계좌 번호 오류입니다.");
			}
			
			//입금하기
			result = this.deposit(con, inputAccount, money);
			if(result == 0)
			{
				throw new SQLException("입금계좌번호 오류입니다.");
			}
			
			//금액확인
			if(! this.isCheckBalance(con, inputAccount))
			{
				throw new SQLException("잔액이 1000원 초과하여 계좌이체를 할 수 없습니다.");
			}
			
			//최종커밋
			con.commit();
			System.out.println("계좌이체 성공하였습니다.");
		}
		catch(SQLException e)			//throw로 날린SQLException을 여기서 바로 처리한다.
		{
			try {
			//취소처리
			
			con.rollback();
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(e.getMessage());
		}
		finally
		{
			DbManager.dbClose(con,null);
		}
	}//메소드 끝
	
	/**
	 * 인출하기
	 * update bank set balance=balance-인출금액 where account = 출금계좌번호;
	 */
	public int withdraw(Connection con,String outputAccount, int money) throws SQLException
	{	
		String sql = "update bank set balance=balance-? where account = ?";
		PreparedStatement ps = null;
		int result = 0;
		
		try
		{
		ps =con.prepareStatement(sql);
		ps.setInt(1, money);
		ps.setString(2, outputAccount);
		
		result = ps.executeUpdate();
		
		}
		finally
		{
			DbManager.dbClose(null, ps);  		//여기서 con닫으면 큰일남.
		}
		
		
		
		return result;
		
	}
	
	/**
	 * 입금하기
	 * update bank set balance=balance+인출금액 where account =입금계좌번호;
	 */
	public int deposit(Connection con,String inputAccount, int money) throws SQLException
	{
		String sql = "update bank set balance=balance+? where account = ?";
		PreparedStatement ps = null;
		int result = 0;
		
		try
		{
		ps =con.prepareStatement(sql);
		ps.setInt(1, money);
		ps.setString(2, inputAccount);
		
		result = ps.executeUpdate();
		
		}
		finally
		{
			DbManager.dbClose(null, ps);  		//여기서 con닫으면 큰일남.
		}
		
		
		
		return result;
		
	}
	
	
	
	
	/**
	 * 잔액조회해서 1000이상이면 false, 아니면 true 리턴
	 * select balance from bank where account=?
	 */
	public boolean isCheckBalance(Connection con, String inputAccount) throws SQLException
	{	
		PreparedStatement ps =null;
		ResultSet rs = null;
		boolean result = false;
		String sql = "select balance from bank where account=?";
		
		
		try 
		{
			ps=con.prepareStatement(sql);
			ps.setString(1, inputAccount);
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				if(rs.getInt(1)<=1000)
				{
					return true;
				}
				
			}
			
			
			
		}
		finally
		{
			DbManager.dbClose(null, ps, rs);
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("--1. 출금계좌 오류----");
		//dao.transfer("A02", "A05",200);//입금, 출금, 금액
		
		
		System.out.println("--2. 입금계좌 오류----");
		//dao.transfer("A04", "A01",200);//입금, 출금, 금액
		
		
		System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
		//dao.transfer("A02", "A01",700);//입금, 출금, 금액
		
		System.out.println("--4. 성공----------");
		dao.transfer("A02", "A01",100);//입금, 출금, 금액
	}
}