package ex0724;

class Parent2
{
		public String nation;
		
		public Parent2()
		{
			this("대한민국");
			System.out.println("Parent2() call");
		}
		
		public Parent2(String nation)
		{
			this.nation = nation;
			System.out.println("Parent2"+this.nation+"call");
			
		}
}
		
		class Child2 extends Parent2
		{
			public String name;
		
			public Child2()
			{
					this("홍길동");
					System.out.println("Child2() call");
			}
			
			public Child2(String name)
			{
				this.name = name;
				System.out.println("Child2"+this.name+"call");
						
			}
		
		}
		
/*출력 순서: Parent2대한민국call
 * 		  Parent2()call
 * 		   Child홍길동call
 * 		   Child()call
 */




public class ChildExample 
{

	public static void main(String[] args) 
	{		
			Child2 child = new Child2();
			

	}

}
