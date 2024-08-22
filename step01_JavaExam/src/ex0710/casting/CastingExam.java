package ex0710.casting;

class CastingExam{
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1= (byte)i1 ;//4byte를 1byte에 넣을수 없다. 캐스팅연산자 필요
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3= (byte)(b2+b1);//연산기호를 만나면 최소한 4byte필요 (b3을 int a로 바꾸면 되긴 함) 

		System.out.println("byte b3="+b3);
		
		long lo=56897L;//8byte
		System.out.println("long lo="+lo);

		int i4=(int)lo+i1; //서로다른 타입이 연산하면 큰타입으로 나와야함,
		System.out.println("int i4="+i4);
		
		boolean boo;
		 boo=false; //boolean은 캐스팅자체가 안됨
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3;//0.00467
		System.out.println("double d="+d);

		float f1=lo;//정수형은 실수형보다 크기공간을 작게본다.
		System.out.println("float f1="+f1);
				
		
	    float f2= (float)d;//d=더블형 
		System.out.println("float f2="+f2);

		char c1,c2, c3; //2byte
		c1='\u0061';
		System.out.println("char c1="+c1);

		 b2=(byte)c1; 
		System.out.println("byte b2="+b2);
		
		c2='A';
		System.out.println("char c2="+c2);
		
		
		c3=(char)(c2+2); //"A"+2     'A'+2
		System.out.println("char c3="+c3); //C
		System.out.println("char c3="+(int)c3);
		
	}

}