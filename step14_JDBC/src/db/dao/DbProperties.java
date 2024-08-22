package db.dao;
/**
 * DB설정 정보 상수로 관리.
 */


public interface DbProperties 
{
	public static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";	//공백넣으면 안댐.
	String URL = "jdbc:oracle:thin:@localhost:1521:XE";							//인터페이스에서는 public statlc final이 생략된것.
	String USER_ID="c##scott";
	String USER_PASS="TIGER";
	
}
