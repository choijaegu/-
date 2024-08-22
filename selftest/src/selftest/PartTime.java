package selftest;

public class PartTime extends Employee 
{
	int timePay;

	public PartTime() 
	{
		super();

	
	}
	public PartTime(String message)
	{
		System.out.println(super.geteNome()+"사원은 정규직입니다.");
	}

	public PartTime(int empNo, String eNome, String job, int mgr, 
			String hiredate, String deptName, int timePay) {
		super(empNo, eNome, job, mgr, hiredate, deptName);
		this.timePay = timePay;
		
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PartTime [timePay=");
		builder.append(super.toString());
		builder.append(timePay);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public void message() {
			System.out.println(super.geteNome()+"사원은 정규직입니다.");
		
	

		
	}
	
	
}
