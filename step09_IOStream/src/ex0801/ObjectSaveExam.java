package ex0801;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectSaveExam 
{
	
	public ObjectSaveExam()
	{
		//객체를 파일에 저장하고 싶다.
		try(
				ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/ex0801/save.txt"));
			)
		{	
			Student st1 = new Student("희정", 20, "서울");
			Student st2 = new Student("나영", 22, "대구");
			
			List<Student> list = List.of(st1, st2, new Student("미미", 20, "제주도"),
										 new Student("효리", 10, "성남"));
			
			
			//저장
			oos.writeObject(st1);
			oos.writeObject(st2);
			oos.writeObject(list);
			
			System.out.println("저장 완료");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		new ObjectSaveExam();
	}

}
