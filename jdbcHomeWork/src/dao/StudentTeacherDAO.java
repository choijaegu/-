package dao;

import java.util.List; 

import dto.Student;
import dto.Teacher; 



public interface StudentTeacherDAO {
	
	public List<Student> getGenderByWomen();
	
	
	public List<Teacher> getTeacherInfoByAddr(String gu);
	

	public Teacher getTeacherInfoBySubject(String subject);
	
	

	
	public Teacher getTeacherInfoByNo(int teacherNo);
}
