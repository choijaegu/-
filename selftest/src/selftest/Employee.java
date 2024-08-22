package selftest;

public abstract class Employee 
{
	int empNo;
	String eNome;
	String job;
	int mgr;
	String hiredate;
	String deptName;
	
	public Employee () 
	{
		
	}
	
	public abstract void message();
	
	
	public Employee(int empNo, String eNome, String job, int mgr, String hiredate, String deptName) {
		super();
		this.empNo = empNo;
		this.eNome = eNome;
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


	public String geteNome() {
		return eNome;
	}


	public void seteNome(String eNome) {
		this.eNome = eNome;
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
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empNo=");
		builder.append(empNo);
		builder.append(", eNome=");
		builder.append(eNome);
		builder.append(", job=");
		builder.append(job);
		builder.append(", mgr=");
		builder.append(mgr);
		builder.append(", hiredate=");
		builder.append(hiredate);
		builder.append(", deptName=");
		builder.append(deptName);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	
}
