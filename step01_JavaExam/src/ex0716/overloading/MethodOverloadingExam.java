package ex0716.overloading;

//MethodOverloadingExam.java
class OverloadedMethod{
	private int i;//전역변수(private = 외부로부터 은닉)
       
	public void  setOverload(int i)
	{
		this.i = i;//인수로 전달된 값을 전역필드에 저장해라.
	}
	
	public int getOverload()
	{
		return i;//전역변수(필드)의 값을 리턴해라.
	}
	
	//setOverload를 Overloading하세요. 리턴도 하세요.
	public String setOverload(String setOver1)
	{	
		return setOver1;
	}
	
	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	double setOverload(double setOver2)
	{
		return setOver2;
	}
	//setOverload를 또 또Overloading 하세요. 리턴 안해요
	protected char setOverload(char setOver3)
	{
		return setOver3;
	}


	//getOverload를 Overloading하세요. 리턴도 하세요.
	public String getOverload(String getOver1)
	{	
		return getOver1;
	}
	
	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	double getOverload(double getOver2)
	{
		return getOver2;
	}
	
	//getOverload를 또 또Overloading 하세요. 리턴 안해요
	protected void getOverload(char getOverload)
	{
		
	}
	
}

class  MethodOverloadingExam{
       
  public static void main(String [] agr)
  	{
	  //OverloadedMethod객체에서 호출가능한  메소드들을 한번씩 호출하세요.
	  
	  OverloadedMethod over = new OverloadedMethod();
	  
	
	  
	  String str = over.setOverload("아아아");
	  System.out.println(str);
	  
	  double dou = over.setOverload(4.26);
	  System.out.println(dou);
	 
	  char cha = over.setOverload('Z');
	  System.out.println(cha);
     
	
	  
	  String str2 = over.getOverload("아메리카노");
	  System.out.println(str2);
	  
	  double dou2 = over.getOverload(3.14);
	  System.out.println(dou2);
	  
        
	}   


}
