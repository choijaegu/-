package exercise0719;

/* 0719 숙제
 * 6장 13번,14번문제
 * 최재구
 */

class Member3
{
	String name;
	String id;
	String password;
	int age;
	
	Member3(String name,String id)
	{
		this.name = name;
		this.id = id;
		System.out.println(this.name+"\t"+this.id);
	}
	
	Member3()
	{
		this("홍길동","hong");
		System.out.println(this.name+"\t"+this.id);
	}
	
}

public class Member
{
	public static void main(String[] args) 
	{	
		
		Member3 m3 = new Member3("홍길동","hong");
		System.out.println();
		Member3 m4 = new Member3();
	}
}


