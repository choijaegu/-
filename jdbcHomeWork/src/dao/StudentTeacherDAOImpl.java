package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Room;
import dto.Student;
import dto.Subject;
import dto.Teacher;

public class StudentTeacherDAOImpl implements StudentTeacherDAO 
{
	/**
	 * 1번 : 성별이 여자인 학생의 정보 검색
       select * from student where  수_주민등록번호 like '%-2%'
	 * */
	
	@Override
	public List<Student> getGenderByWomen()
	{	
		List<Student>list = new ArrayList<Student>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from student where  수험생주민등록번호 like '%-2%'";
		
		
		try
		{
		con = DbManager.getConnection();
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while(rs.next())
		{
			int studentNo = rs.getInt(1);
			String studentName = rs.getString(2);			
			String studentJumin= rs.getString(3);			
			String studentPhone = rs.getString(4);			
			String studentAddr = rs.getString(5);			
			String studentEmail = rs.getString(6);	
			
			list.add(new Student(studentNo,studentName,studentJumin,studentPhone
								,studentAddr,studentEmail));
			
			
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbManager.dbClose(con, ps, rs);
		}
		
		
		
		return list;
	}
	
	/**
	 * 3.  "구"를 인수로 전달받아 구에 거주하는 강사의 정보 검색
	 *      select * from teacher  where 주소 like ?
	 * */
	@Override
	public List<Teacher> getTeacherInfoByAddr(String gu) 
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from teacher  where 주소 like ?";
		List<Teacher> list = new ArrayList<Teacher>();
		
		try
		{
		con = DbManager.getConnection();
		ps = con.prepareStatement(sql);
		ps.setString(1, "%"+gu+"%");
		rs = ps.executeQuery();
		
		
		
		while(rs.next())
		{
			int teacherNo = rs.getInt(1);
			String teacherName  = rs.getString(2);
			String teacherJumin = rs.getString(3);
			String teacherPhone = rs.getString(4);
			String teacherAddr = rs.getString(5);
			String teacherEmail = rs.getString(6);
			String sugangCode = rs.getString(7);
			
			list.add(new Teacher(teacherNo,teacherName,teacherJumin,teacherPhone,
								teacherAddr,teacherEmail,sugangCode));
		}
		
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbManager.dbClose(con, ps, rs);
		}
		
		return list;
	}
	
	/**
	 * 5. 과목을 인수로 전달받아 그 과목을 강의하는 강사의 정보 (서브쿼리) 
         select * from teacher where 수강코드 = 
          (select 수강코드 from subject where upper(과목)=upper( ? ))
	 * */
	@Override
	public Teacher getTeacherInfoBySubject(String subject) 
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from teacher where 수강코드 = \r\n"
				+ "          (select 수강코드 from subject where upper(과목)=upper( ? ))";
		Teacher teacher = null;
		
		try 
		{
		con = DbManager.getConnection();
		ps = con.prepareStatement(sql);
		ps.setString(1, subject);
		rs = ps.executeQuery();
		
		if(rs.next())
		{
		int teacherNo = rs.getInt(1);
		String teacherName = rs.getString(2);
		String teacherJumin = rs.getString(3);
		String teacherPhone = rs.getString(4);
		String teacherAddr = rs.getString(5);
		String teacherEmail = rs.getString(6);
		String sugangCode = rs.getString(7);
		
		
		teacher = new Teacher(teacherNo,teacherName,teacherJumin,teacherPhone
									  ,teacherAddr,teacherEmail,sugangCode);
		
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DbManager.dbClose(con, ps, rs);
		}
		
		
		return teacher;
	}
	
	/**
	 * 8강사의 번호를 인수로 전달받아 뷰에서 그 강사번호에 해당하는 정보를 출력한다
	 *   select * from v_teacherInfo  where 강사번호=?
	 * 
	 * */
	@Override
	public Teacher getTeacherInfoByNo(int teacherNo) 
	{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Teacher teacher = null;
		String sql = "select  * from v_tear where 강사번호 =? ";
		try
		{
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, teacherNo);
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				int No = rs.getInt(1);
				String teacherName = rs.getString(2);
				String sugangCode = rs.getString(3);
				String subjectName = rs.getString(4);
				Subject subject = new Subject(sugangCode,subjectName);
				
				//teacher.setSubject(subject) 
				
				int roomNo = rs.getInt(5);
				int roomCount = rs.getInt(6);
				Room room = new Room(roomNo,roomCount);
				
				//room.setRoom(new Room(roomNo,roomCount));
				
				teacher = new Teacher(No,teacherName,sugangCode,subject,room);
			}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
		
		
		return teacher;
	}

	
	
}
