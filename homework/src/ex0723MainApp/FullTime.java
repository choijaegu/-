package ex0723MainApp;

public class FullTime extends Employee 
{
		int salary;
		int bonus;
		
		public FullTime() {}

		public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) 
		{	
			super(empNo, eName, job, mgr, hiredate, deptName);		//제일중요한 키워드★
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
		public String toString()
		{	
			//String builder builder = new StringBuilder();
			
			//String superInfo = super.toString();		=>부모쪽 toString 결과값을 호출해서 가져옴.
			
			//builder.append(superInfo);	
			
			return getEmpNo()+" | "+geteName()+" | "+getJob()+" | "+getMgr()+" | "+getHiredate()+" | "+getDeptName()+" | "+getSalary()+" | "+getBonus();
		}
		@Override
		public void empMessage()
		{
			System.out.println(geteName()+"사원은 정규직입니다.");
		}
}
