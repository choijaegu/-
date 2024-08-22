package ex0724.exam;

public class Tv extends Elec implements ElecFunction
{
	private int chnnel;
	
	public Tv(String code, int cost, int chnnel)
	{	
		super(code,cost);
		this.chnnel = chnnel;
	}

	public int getChnnel() {
		return chnnel;
	}

	public void setChnnel(int chnnel) {
		this.chnnel = chnnel;
	}
	
	public void start()
	{
		System.out.println(getCode()+"제품"+super.getClass().getSimpleName()+ chnnel +"으로 본다.");		//이름만가져오고
																											//Simple이 없으면 패키지명까지 가져옴
	}
	
	public void stop()
	{
		
	}
	
	public void display()
	{
		
	}
	@Override
	public String toString() 
	{	
		StringBuilder builder = new StringBuilder();
		String superInfo = super.toString();
		builder.append(superInfo);
		builder.append("TV를 ");
		builder.append(getChnnel());
		builder.append("을 본다.");
		
		return builder.toString();
	}
}
