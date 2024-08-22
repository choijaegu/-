package ex0726.List;

public class Emp implements Comparable<Emp>
{
	private int empno;
	private String ename;
	private int age;
	private String addr;
	
	public Emp() {}
	public Emp(int empno, String ename, int age, String addr) {
		
		this.empno = empno;
		this.ename = ename;
		this.age = age;
		this.addr = addr;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
		builder.append("Emp [empno=");
		builder.append(empno);
		builder.append(", ename=");
		builder.append(ename);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * 0이면 같다
	 * 양수면 왼쪽이 크다
	 * 음수면 오른쪽이 크다
	 * 
	 * :현재 자기자신과 인수로 전달된 객체를 비교한다.
	 */
	public int compareTo(Emp o)
	{
		System.out.println("Comparable의 compareTo call...");
		
		return empno - o.getEmpno(); //0 or 음수 or 양수
		//return o.getEmpno()-empno; //내림차순
	}

}
