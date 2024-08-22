package ex0723MainApp;

public class PartTime extends Employee
{
		int timePay;
		
		public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName,int timePay)
		{	
			super(empNo, eName, job, mgr, hiredate, deptName);		//매우중요.
			this.timePay=timePay ;
			
		}

		public int getTimePay() {
			return timePay;
		}

		public void setTimePay(int timePay) {
			this.timePay = timePay;
		}
		
		@Override
		public String toString() 
		{
			return getEmpNo()+" | "+geteName()+" | "+getJob()+" | "+getMgr()+" | "+getHiredate()+" | "+getDeptName()+" | "+getTimePay();
		}
		
		public void empMessage()
		{
			System.out.println(geteName()+"사원은 비정규직입니다.");
		}
}
