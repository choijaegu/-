package selftest;

public class FullTime extends Employee 
{
	int salary;
	int bonus;
	
	public FullTime() 
	{
		
	}
	
	

	public FullTime(int empNo, String eNome, String job, int mgr, String hiredate, 
			String deptName, int salary, int bonus) {
		super(empNo, eNome, job, mgr, hiredate, deptName);
		this.salary = salary;
		this.bonus = bonus;
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FullTime [salary=");
		builder.append(super.toString());
		builder.append(salary);
		builder.append(", bonus=");
		builder.append(bonus);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public void message() 
	{
		System.out.println(super.geteNome()+"사원은 정규직입니다.");
	
	}

	
	
	
	
}
