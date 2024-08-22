package exercise0719;

/* 0719 숙제
 * 6장 17번문제
 * 최재구
 */
public class Printer02 
{
	static int i;
	static boolean b;
	static double d;
	static String st;
	
	static void println(int value)
	{
		i = value;
		System.out.println(i);
	}
	
	static void println(boolean value)
	{
		b = value;
		System.out.println(b);
	}
	
	static void println(double value)
	{
		d = value;
		System.out.println(d);
	}
	
	static void println(String value)
	{
		st = value;
		System.out.println(st);
	}
}
