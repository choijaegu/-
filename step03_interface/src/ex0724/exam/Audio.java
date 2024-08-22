package ex0724.exam;

public class Audio extends Elec implements ElecFunction
{
		int volumn;
		
		public Audio(String code, int cost, int volumn)
		{
			super(code,cost);
			this.volumn=volumn;
		}

		public int getVolumn() {
			return volumn;
		}

		public void setVolumn(int volumn) {
			this.volumn = volumn;
		}
		
		public void start()
		{
			System.out.println(getCode()+"제품"+super.getClass().getSimpleName()+ volumn +"으로 듣는다.");
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
			builder.append("Audio를 ");
			builder.append(getVolumn());
			builder.append("을 듣는다.");
		return builder.toString();
		}
}
