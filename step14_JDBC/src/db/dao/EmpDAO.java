package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.vo.Emp;

public class EmpDAO 
{
	/**
	 * 사원테이블에서 모든사원 이름 조회.
	 * :select ename for emp
	 */
	
	public void selectByEname()
	{	//로드연결
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
		
			
			
			
			try 
			{
				con = DbManager.getConnection();
				st = con.createStatement();
				rs = st.executeQuery("select ename from emp");
				while(rs.next())	//현재 위치에서 행을 아래로 내린다.
				{
					//열을 조회
					String ename = rs.getString("eName");
					System.out.println(ename);
				}
			}
				
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			
			
			finally
			{
				DbManager.dbClose(con,st,rs);
			}
	
		
	}
	
	/**
	 * 모든 사원 정보 조회하기
	 *select empno, ename, job, sal, hiredate from emp
	 */
	public List<Emp> selectAll()
	{
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Emp> list = new ArrayList<Emp>();
		try
		{
			con = DbManager.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select empno, ename, job, sal, hiredate from emp");
			
			
			
			while(rs.next())
			{
				int empno = rs.getInt("empno");
				
				String ename = rs.getString("ename");
				
				String job = rs.getString("job");
				
				int sal = rs.getInt(4);		//인덱스 순서로 넣어도 상관없음.
				
				String hiredate = rs.getString("hiredate");		//date는 그냥 스트링으로 받음.
				
				//하나의 레코드 정보를 Emp객체 만들고
				
				//만든 Emp객체를 list에 추가한다.
				
				list.add(new Emp(empno,ename,job,sal,hiredate));
				
				
			}
			System.out.println("\n");
			System.out.println("\n");
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbManager.dbClose(con,st,rs);
		}
		return list;
	}
	
	
	
	/**
	 * 사원번호에 해당하는 사원정보 조회
	 *select empno, ename, job, sal, hiredate from emp where empno=7654
	 */
	public Emp selectByEmpno(int empno)
	{
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Emp emp = null;
		
		try
		{
			con = DbManager.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select empno, ename, job, sal, hiredate from emp where empno="+empno);
			
			if(rs.next()) 
			{
				emp = new Emp(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbManager.dbClose(con, st,rs);
		}
		return emp;
		
		
	}
	
	/**
	 * 사원등록
	 * insert into emp(empno,ename,job,sal,hiredate)
	 * values values(9000,'hee','teacher',2000,sysdate)
	 */
	public int insert(Emp emp)
	{
		Connection con = null;
		Statement st = null;
		String sql = "";
		int result = 0;
		
		try 
		{
			con = DbManager.getConnection();
			st = con.createStatement();
			result = st.executeUpdate(sql);
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbManager.dbClose(con, st);
		}
		return result;
		
	}
	
	
	public int preparedInsert(Emp emp)
	{
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into emp(empno,ename,job,sal,hiredate)"
				+ "values (?,?,?,?,sysdate)";					//시낵스에러뜬거는 쿼리문을 잘못쓴거임.
		int result = 0;
		
		try 
		{
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			//반드시 ?가 있다면 ?에 순서대로 개수만큼 ps.setXxx(? index, 값) 필요
			
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getSal());
			
			
			
			result = ps.executeUpdate();			//프리페어는 이미 쿼리가 준비되서 들어가기 때문에 인수에 아무것도 없어도 됨.
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbManager.dbClose(con, ps);
		}
		return result;
		
	}
	
	
	
}
