package exseptionShop;

/**
 * 나이가 18보다 작을 때 발생시킬 예외 객체
 * */
public class NoKidsException extends Exception{//일반예외
//public class NoKidsException extends RuntimeException{//비체크예외
	
	public static int count; //0
	
   public NoKidsException() {
	   super("애들은 가라");
	   count++;
   }
   
   public NoKidsException(String message) {
	   super(message);
	   count++;
   }
}
