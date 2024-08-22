package ex0717;

public class Student 
{
	private String name ;
	private int age ;
	private String addr ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) 
	{	
		if(age<18)
		{System.out.println("18보다 작으면 변경할 수 없어요.");
			return;	/*void지만 return만(=값 없이) 넣으면 '해당 함수(=메소드)를 빠져나가라'는 뜻.
					*break를 쓰면 for문 탈출하는것
					return은 메소드 전체를 탈출하는것*/
		}
		
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	//setXxx,getXxx 작성
	
}
