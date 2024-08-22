package Box;

public class MainApp 
{	
	public static void main(String[] args)
	{
		MainApp ma = new MainApp();
		
		Box<Integer>box1=ma.boxing(100);
		System.out.println(box1.getT());
		
		Box<String>box2 = ma.boxing("희정");
		System.out.println(box2.getT());
		
		
	}
	
	
	public <T>Box<T>boxing(T t)
	{
		Box<T>box = new Box<T>();
		box.setT(t);
		
		return box;
	}
	
	public <T>Box<T>boxing2()
	{
		return null;
	}
	
	public <A> void boxing3(A t)
	{
		
	}
	
	
}
