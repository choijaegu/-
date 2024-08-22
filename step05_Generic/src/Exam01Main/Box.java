package Exam01Main;

public class Box<T>				//다른 알파벳 하나로도 가능. 
{
	public T content;
	
	public void setContent(T content){
		this.content = content;
}
	public T getContent()
	{
		return content;
	}
	
	
}
