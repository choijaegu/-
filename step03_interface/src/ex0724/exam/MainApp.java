package ex0724.exam;

public class MainApp 
{

	public static void main(String[] args) 
	{	
		// Tv 2대 , Audio 2대 저장하고 그 정보를 출력한다.
		ElecFunction elec[] = new ElecFunction[5];			//인터페이스 일렉펑션 타입

		elec[0] = new Tv("A01", 500000, 12);				//Tv는 일렉펑션이다.
		elec[1] = new Tv("A02", 2500, 20);					//즉 인터페이스는 무조건 메소드들을 재정의를 하게되므로 초기화면에 많이쓰임.
		elec[2] = new Tv("A03", 3000, 30);
					
		elec[3] = new Audio("A04", 8500, 200);				//Audio는 일렉펑션이다.
		elec[4] = new Audio("A05", 700, 100);

		for (ElecFunction e : elec) 
		{
			 //e.start();
			 
			System.out.println(e);
		}

	}
}
