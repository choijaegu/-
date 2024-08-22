package goodsList;

public class Goods 
{
	private String code;
	private String name;
	private String price;
	private String explain;
	
	public Goods() {}

	public Goods(String code, String name, String price, String explain) {
		super();
		this.code = code;
		this.name = name;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Goods [code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", explain=");
		builder.append(explain);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
}
