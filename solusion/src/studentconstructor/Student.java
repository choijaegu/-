package studentconstructor;

/**
 * 학생의 속성을 관리하는 객체
 *  : Value Object = DTO(Data Transfer Object) = Domain
 * */
public class Student {
  //외부에서 직접 필드를 접근 할수 없다.
  private String name; //null
  private int age;//0
  private String addr;//null
  
  public Student() {}
  public Student(String name, int age, String addr) {
	  //데이터 초기화
	  this.name=name  ;
	  this.age=age  ;
	  this.addr=addr  ;
  }
  
  /**
  setXxx()
   : 제한자 - public
   : 리턴타입 -  void
   : 메소드이름 - set + 필드이름첫글자대문자
   : 인수 : 있다.
*/
  public void setName(String name) {
	  this.name=name;
  }
  public void setAge(int age) {
	  if(age>18)
	    this.age=age;
  }
  
  public void setAddr(String addr) {
	  this.addr=addr;
  }
  
  /**
  getXxx()
    : 제한자 - public
    : 리턴타입 -  있다.
    : 메소드이름 - get + 필드이름첫글자대문자
    : 인수 : 없다.
*/
   public String getName() {
	  return this.name;
   }
   public int getAge() {
	 return this.age;
   }
   public String getAddr() {
	 return this.addr;
   }  
}