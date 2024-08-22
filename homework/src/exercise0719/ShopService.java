package exercise0719;

/* 0719 숙제
 * 6장 18번문제
 * 최재구
 */

public class ShopService 
{	
	private static ShopService singleton = new ShopService();
	
	private ShopService(){}
	
	public static ShopService getInstance()
	{ 
		return singleton;
	}
}
