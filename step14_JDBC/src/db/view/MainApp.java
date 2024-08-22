package db.view;

import java.util.List;

import db.dao.EmpDAO;
import db.vo.Emp;

public class MainApp 
{

	public static void main(String[] args) 
	{
		//1. 사원이름 검색

		System.out.println("**JDBC TEST ****");
		
		EmpDAO dao = new EmpDAO();
		
		dao.selectByEname();
		
		
		//2. 전체 사원정보 조회
		
		System.out.println("전체검색");
		
		List<Emp> list = dao.selectAll();
		for(Emp e: list)
		{
			System.out.println(e);
		}
		
		//3.특정 사원정보조회
		System.out.println();
		Emp emp = dao.selectByEmpno(7566);
		
		if(emp==null)
		{
		System.out.println("찾는 사원이 없습니다.");
		}
		else
		{
			System.out.println(emp);
		}
		
		//4.사원번호검색
		System.out.println();
		
		int re = dao.preparedInsert(new Emp(9001, "heejung", "teacher", 2500, null));
		if(re >0)
		{
			System.out.println(re+"등록되었습니다.");
		}
		else
		{
			System.out.println(re+"등록되지 않았습니다.");
		}
		
		
		
	}

}
