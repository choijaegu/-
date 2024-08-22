public class GoodsService
{
	private Goods goodsArr[]=new Goods[100]
			public static int count;
	
	public GoodsService(String data[][])
	{
		for(int i = 0; i<data.length; i++)
		{
			goodsArr[count++]=this.create(data[i]);
		}
	}
		
	private Goods create(String row[])
	{
		Goods goods = new Goods(row[0], row[1], integer.parseInt(row[2]), row[3]);
		
		return goods;
		
	}
		
		
}