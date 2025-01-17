package view;

import java.util.ArrayList;
import java.util.List;

import dao.StudentTeacherDAO;
import dao.StudentTeacherDAOImpl;
import dto.Student;
import dto.Teacher;

public class MainApp 
{

	public static void main(String[] args) 
	{	
		//1. 
		List<Student>list = new ArrayList<Student>();
		
		System.out.println("***여자학생 정보***");
		
		StudentTeacherDAO studentDao = new StudentTeacherDAOImpl();
		
		list = studentDao.getGenderByWomen();
		
		for(Student stu : list)
		{
			System.out.println(stu);
		}
		System.out.println();
		
		//2.
		List<Teacher>list2 = new ArrayList<Teacher>();
		
		list2 = studentDao.getTeacherInfoByAddr("구");
		
		for(Teacher tea: list2 )
		{
			System.out.println(tea);
		}
		System.out.println();
		
		//3.
		Teacher teacher = studentDao.getTeacherInfoBySubject("asp");
		
		System.out.println(teacher);
		System.out.println();
		
		//4.
		Teacher teacher2 = studentDao.getTeacherInfoByNo(1);
				
		
		System.out.print(teacher2.getTeacherNo());
		System.out.print(teacher2.getTeacherName());
		System.out.print(teacher2.getSugangCode());
		System.out.print(teacher2.getSubject());
		System.out.println(teacher2.getRoom());
		
		
		
	}

}
