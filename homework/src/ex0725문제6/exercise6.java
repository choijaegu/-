package ex0725문제6;

public class exercise6 
{
	static String strArray[] = {"10","2a"};
	static int value = 0;
	
	
	public static void main(String[] args) 
	{
		for(int i=0; i<=2; i++)
		try
		{
		value = Integer.parseInt(strArray[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("인덱스를 초과했음");
		}
		catch(NumberFormatException e)
		{
			System.out.println("숫자로 변환할 수 없음.");
		}
		finally
		{
			System.out.println(value);
		}
		
		
		
		
		
	}

}
