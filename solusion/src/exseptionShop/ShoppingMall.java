package exseptionShop;

/**
 *   2.쇼핑몰 클래스 한개
          - 나이를 인수로 받는 메소드 작성
            입력된 나이에 따라 예외발생 또는 메시지 출력
            만약, 예외가 발생하면 직접처리하지 않고 던진다.
 * */
public class ShoppingMall {
  public void enter(int age) throws NoKidsException{
	 if(age < 18) {
		 //예외발생
		 //throw new NoKidsException();
		 throw new NoKidsException(age+"살 은 입장할수 없어요!");
	 }
	 
	 System.out.println(age + "살 님 입장하신걸 환영합니다.^^");
	 
  }//enter메소드 끝
}
