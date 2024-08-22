package ex0710;
class MathOperatorExam{
	public static void main(String []args){
		int i=5;
		int j=2;
		System.out.println("i+j="+i+j);//52 <="i+j="+i로 하면 우선순위가 String으로 됨
		System.out.println("i-j="+(i-j));//3 
		System.out.println("i*j="+(i*j));//10
		System.out.println("i/j="+(i/j));//2
		System.out.println("i%j="+(i%j));//1

		System.out.println("i="+i);//5
		
		int k=i++;//선대입 후 증가
		System.out.println("k="+k);//5
		System.out.println("i="+i);//6
		
		int p=++i;//선증가 후 대입
		System.out.println("p="+p);//7
		System.out.println("i="+i);//7

		int x =19 + 4 * 3 / 2 - 10 * 2 + 4;//우선순위 첫번째연산 4*3/2. =>두번째연산 10*2

		System.out.println("19+4*3/2-10*2+4="+x);//
	}	
}