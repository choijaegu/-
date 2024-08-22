package ex0716.overloading;

public class VariableAtgsExam {

	public void test(int...i)//배열로 전달 자바에서 배열은 객체.(int타입 0개이상 넣을 수 있음)
	{
		System.out.println("i의 값 :"+i);
		for(int index=0; index<i.length ; index++)
		{
			System.out.println(i[index]+"\t");
		}
		System.out.println();
	}
	
	public void test(String str, int ...i)
	{
		
	}
	
	/*public void test2(String ...s, int ...i)//variable 아규먼트 스트링은 언제나 마지막에 와야함.
	{
		
	}*/
	public static void main(String[] args) 
	{
		System.out.println("---------호출해보자-------");
		
		VariableAtgsExam ve = new VariableAtgsExam();
		ve.test(4);
		ve.test();
		ve.test(4,3);
		ve.test(4,3,4);
		
		ve.test("A",1,2,3);
		ve.test("B",2);
		ve.test("C",1,2,3,6,7,7);
		ve.test("D");//스트링은 생략할 수 없음.
	}

}
