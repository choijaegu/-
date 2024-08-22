package dao;

/**
 * DB설정 정보 상수로 관리.
 */


public interface DbProperties
{
	public static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	String USER_ID="JAEGU";
	String USER_PASS="1234";
	
	
	
}
