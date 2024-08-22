package Exam01Main;

public class Exam02메인
{	
	public static void main(String[] args) 
	{
		
	
	Product<Tv, String> p1 = new Product<>;
	p1.setKind(new Tv());
	p1.setModel("스마트 TV");
	
	Product<Audio, String> p2 = new Product<>;
	p2.setKind(new Audio());
	p2.setModel("매트로 오디오");
	
	//상품조회
	
	Tv t = p1.getKind();
	Audio au = p2.getKind();
	
	////////////////////////////
	//제네릭을 안쓰면?
	Product p3 = new Product();
	p3.setKind ( new Tv());
	p3.setModel( "일반TV");
	
	Object obj = p3.getKind();
	if(obj instanceof Tv)
		Tv t3=(Tv)obj;
	System.out.println(t3.channel);

		
	}
	
	
	
}
