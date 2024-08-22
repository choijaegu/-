package Box;

public class Box<T> {//제네릭타입 
						//안에 들어가는 T는 클래스명 옆에 <T>를 넣어줘야함.
   public T content;
   
   public void setContent(T content) {
	this.content = content;
  }
  
   public T getContent() {
	return content;
  }
}
