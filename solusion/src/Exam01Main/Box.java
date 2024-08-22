package Exam01Main;

public class Box<T> {
   public T content;
   
   public void setContent(T content) {
	this.content = content;
  }
  
   public T getContent() {
	return content;
  }
}
