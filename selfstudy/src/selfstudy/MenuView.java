package selfstudy;

import java.util.Scanner;
public class MenuView 
{
	private Scanner sc = new Scanner(System.in);
	private GoodsService service;
	
	public MenuView(String[][]data)
	{
		service = new GoodsService(data);
	}
}
