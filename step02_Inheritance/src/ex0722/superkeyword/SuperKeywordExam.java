package ex0722.superkeyword;

class Animal
{
	int age=5;
	String bodyColor;//부모에만 있는 필드명
	
	public void sound()
	{
		System.out.println("어흥");
	}
	
	public void run()
	{
		System.out.println("잘 뛴다");
	}
}

//////////////////////////////////////////

class Cat extends Animal
{
	int age=2;//부모필드명 중복
	int weight;//자식에만 있는 필드명
	
	public void test()
	{
		System.out.println(age);//2
		System.out.println(this.age);//2  => 이때 this는 나 자신을 호출함.
		System.out.println(super.age);//5
		System.out.println(weight);//0
		System.out.println(this.weight);//0
		//System.out.println(super.weight);=>super는 무조건 부모꺼
//////////////////////////////////////////////
		System.out.println(bodyColor);//null
		System.out.println(this.bodyColor);//null(this는 전역변수가 자식에 없어도 부모꺼 쓸 수 있음.)
		System.out.println(super.bodyColor);//null
//////////////////////////////////////////////
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ메소드호출ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		sound();
		this.sound(); //=>이때 this는 나 자신 을 호출함
		super.sound();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		clim();
		this.clim();
		//super.clim();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		run();
		this.run();
		super.run();
		
		
	}//테스트 끝
		@Override		//(아노테이션?)재정의 된거라고 시스템이나 같은 개발자에게 알려주는것.
		public void sound()
		{
			System.out.println("야옹");
		}
		//자식에만 존재하는 메소드 정의
		public void clim()
		{
			System.out.println("잘 탄다.");
		}
		
}







public class SuperKeywordExam 
{
	
	public static void main(String[] args) 
	{
		//new Cat().test(); //=>호출
		
		Cat cat = new Cat();
		System.out.println("***필드접근***");
		System.out.println("cat = " + cat);
		
		System.out.println("cat.age = "+cat.age);			//자기자신이 먼저나옴
		System.out.println("cat.weight = "+cat.weight);
		System.out.println("cat.bodyColor = "+ cat.bodyColor);
		
		System.out.println("***메소드 접근****");
		cat.sound();
		cat.run();
		cat.clim();
		
		System.out.println("=====================================");
		Animal an = new Cat();
		
		System.out.println("an.age = "+an.age);			//부모꺼로 나옴.
		//System.out.println("an.weight = "+an.weight);		=>부모타입 변수로는 자식 부분 접근 불가.
		System.out.println("an.bodyColor = "+ an.bodyColor);
		
		System.out.println("***메소드 접근****");
		an.sound();				//=>★★★매우중요  재정의된 메소드는 부모타입이더라도 무조건 재정의된 메소드호출된다.
		an.run();
		//an.clim();			=>부모타입 변수로는 자식부분 접근 불가.
		
		//부모타입 레퍼런스 변수를 자식타입으로 형변환해서 서브쪽 접근///////////
		if(an instanceof Cat) 
		{
		Cat c = (Cat)an;//이 행위를 ObjectDownCasting 한다라고 한다.
		System.out.println("c= "+c);
		
		System.out.println("c.weight = "+ c.weight);
		c.clim();
		
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		Animal a= new Animal();
		System.out.println();
	}
}
