package dto;
/**
 *  고객의 정보를 관리할 객체 
 * */
public class UserDto {
   private int userSeq; // setUserSeq, getUserSeq
   private String name;
   private String email;
   private String phone;
   private boolean sleep;//기본값 false -> private인 경우는 sleep이름으로 한다. 
   
   public  UserDto() {}
   public UserDto(int userSeq, String name, String email, String phone, boolean sleep) {
	this.userSeq = userSeq;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.sleep = sleep;
  }
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isSleep() {
		return sleep;
	}
	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("고객코드: ");
		builder.append(userSeq);
		builder.append(", 이름: ");
		builder.append(name);
		builder.append(", 이메일: ");
		builder.append(email);
		builder.append(", 핸드폰번호: ");
		builder.append(phone);
		builder.append(", 휴면여부: ");
		builder.append(sleep);
		builder.append("\n");

		return builder.toString();
	} 

	
}