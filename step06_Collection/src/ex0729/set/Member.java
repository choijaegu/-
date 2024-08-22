package ex0729.set;

public class Member 
{
	private String name;
	private int age;
	private String addr;
	
	public Member() {}

	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	
	//우리의 입맛대로 중복처리를 하려면 add안에 있는 hashcode와 equals를 오버라이딩한다.
	
	
	@Override
	public int hashCode() 								//해쉬코드로만 비교하기엔 @같은 특수문자가 들어가있으면 확연히 다른 String 끼리 같다고 판단할때도	
														//있기때문.
	{	
		//int no = (int)(Math.random()*3);
		//System.out.println("해쉬코드 콜"+no);
		System.out.println("해쉬코드 콜"+name.hashCode());
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)			//해쉬코드에서 중복이 없으면 equals는 호출이 안됨.
	{											//이퀄스가 호출됬을때 
		System.out.println("이퀄스 콜");
		if(obj instanceof Member m)
		{	
			if(name.equals(m.getName()) && age == m.getAge())
			{
				return true;
			}
		}
		
		return false;
	}
	
	
}
