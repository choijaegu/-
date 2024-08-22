package ex0722.overriding;
class EqualsExam2{
	String name;//a
	
	public EqualsExam2(String s)
	{	
		name = s;
	}
	
	@Override
	public boolean equals(Object obj) {
		//현재객체의 문자열과 인수로 전달된 문자열을 비교해라.
		if(obj instanceof EqualsExam2) {
			EqualsExam2 ee = (EqualsExam2) obj;
			boolean re = name.equals(ee.name);
			return re;
		}else {
			return false;
		}
	}
	
	
	public static void main(String args[]){		
		System.out.println("\nEqualsExam ee1 = new EqualsExam(\"Object.equals()\");" );
		System.out.println("\nEqualsExam ee2 = new EqualsExam(\"Object.equals()\");" );
				
		EqualsExam2 ee1 = new EqualsExam2("a");
		EqualsExam2 ee2 = new EqualsExam2("a");
		
		if(ee1.equals(ee2)){//Object에 정의되어있는 주소값비교 =>재정의해서 다른것과 비교
			System.out.println("같다");
		}else{
			System.out.println("다르다");//O
		}
		
		if(ee1 == ee2){//주소값
			System.out.println("(ee1 == ee2) = true");
		}else{
			System.out.println("(ee1 == ee2) = false");//O
		}
		
		System.out.println("\nString s1 = \"new String Object1\";");
		System.out.println("\nString s2 = \"new String Object1\";");
		
		String s1 = "new String Object1";
		String s2 = "new String Object1";
		
		if(s1.equals(s2)){//문자열
			System.out.println("s1.equals(s2) = true");//O
		}else{
			System.out.println("s1.equals(s2) = false");
		}
		
		if(s1==s2){//주소값
			System.out.println("(s1==s2) = true");//O
		}else{
			System.out.println("(s1==s2) = false");
		}

		System.out.println("\nString s3 = new String(\"new String Object2\");");
		System.out.println("\nString s4 = new String(\"new String Object2\");");
 
 		String s3 = new String("new String Object2");
		String s4 = new String("new String Object2");
		
		if(s3.equals(s4)){//문자열
			System.out.println("s3.equals(s4) = true");//O
		}else{
			System.out.println("s3.equals(s4) = false");
		}
		
		if(s3==s4){//주소값
			System.out.println("(s3==s4) = true");
		}else{
			System.out.println("(s3==s4) = false");//O
		}

		System.out.println("\nString s5 = new String(\"new String Object3\");");
		System.out.println("\nString s6 = \"new String Object3\";");
		System.out.println("\nString s7 = \"new String Object3\";");
 
 		String s5 = new String("new String Object3");
		String s6 = "new String Object3";
		String s7 = "new String Object3";
		
		if(s5.equals(s6)){//문자열
			System.out.println("s5.equals(s6) = true");//O
		}else{
			System.out.println("s5.equals(s6) = false");
		}
		
		if(s5==s6){//주소값
			System.out.println("(s5==s6) = true");
		}else{
			System.out.println("(s5==s6) = false");//O
		}

			
		if(s6.equals(s7)){//문자열
			System.out.println("s6.equals(s7) = true");//O
		}else{
			System.out.println("s6.equals(s7) = false");
		}
		
		if(s6==s7){//주소값
			System.out.println("(s6==s7) = true");//O
		}else{
			System.out.println("(s6==s7) = false");
		}
	}
}