package selfstudy;

public class Goods 
{
		private String code;
		private String name;
		private int price;
		private String explain;
		
		public Goods() {}
		public Goods(String code, String name, int price, String explain)
		{
				this(code,price,explain);
				this.name = name;
		}
		
		public Goods(String code,int price, String explain)
		{
			this.code = code;
			this.price = price;
			this.explain = explain;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getExplain() {
			return explain;
		}
		public void setExplain(String explain) {
			this.explain = explain;
		}
}
