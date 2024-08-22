package ex0723MainApp;


abstract public class Employee 
{	
	
	
	
	private int empNo;
	private String eName;
	private String job;
	private	int mgr;
	private String hiredate;
	private String deptName;
	
	public Employee() {}

	public Employee(int empNo, String eName, String job, int mgr, String hiredate, String deptName) 
	{
		
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptName = deptName;
	}

	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString()		//println이 객체를 넣으면 무조건 호출해줌.//String Builder랑 build.append를 사용해서 만드는게 좋음.
	{	
		
	
		
		return empNo+" | "+eName+" | "+job+" | "+mgr+" | "+hiredate+" | "+deptName;
	}

	abstract public void empMessage();		//재정의는 무조건 상속관계일때 가능함
}

