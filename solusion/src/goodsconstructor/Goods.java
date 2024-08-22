package goodsconstructor;
/**
  상품으로 속성을 관리하는 개체
*/
public class Goods{
	private String code; //상품코드 null
	private String name;//상품이름  null
	private int price;//가격 0 
	private String explain;//설명 null
	
	//생성자작성
	public Goods() {}
	public Goods(String code, String name, int price, String explain) {
		this(code, price,explain);
		this.name=name;
	}

	public Goods(String code, int price, String explain) {
		this.code=code;
		this.price=price;
		this.explain=explain;		
	}
	//setXxx
    public void setCode(String code){
        //기능
		this.code =code;
	}
	public void setName(String name){
        //기능
		this.name = name;
	}
	public void setPrice(int price){
        //기능
		this.price =price;
	}
	public void setExplain(String explain){
        //기능
		this.explain =explain;
	}

	//getXxx
	public String getCode(){
       return code;
	}
    public String getName(){
       return name;
	}
	public int getPrice(){
       return price;
	}
	public String getExplain(){
       return explain;
	}

}