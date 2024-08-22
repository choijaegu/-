package jdbcPractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Student;

public class StudentTeacherDAOImpl 
{
	/**
	 * 1번. 성별이 여자인 학생의 정보 검색
	 */
	
	public List<Student> getGenderByWomen()
	{
		List<Student> list = new ArrayList<Student>();
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
				String studentJumin = rs.getString(3);
				String studentPhone = rs.getString(4);
				String studentAddr = rs.getString(5);
				String studentEmail = rs.getString(6);
				
				list.add(new Student(studentNo,studentName,studentJumin,studentPhone,
									studentAddr,studentEmail));
				
				
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
	
	
	
	
}
