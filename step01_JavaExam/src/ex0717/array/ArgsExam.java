package ex0717.array;

public class ArgsExam 
{

	public static void main(String[] args) 
	{
		System.out.println(args);
		System.out.println(args.length);
		for(String ar : args)
		System.out.println(ar);
		
		int sum = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));//String을 int로 바꾸려면 각각을 인티져파스인트로 숫자로 정해야 함.
		System.out.printf("%s + %s = %d%n", args[0], args[1], sum);
	}
}

/* 실행
	java 파일이름(클래스를 뜻 함.) 값 값 값 ......


	ex)
	java ArgsExam
	
	
	
*/