package Product;

/**
 * 상품의 정보 :  종류(ex- TV, Audio, vedio, ....)  , 모델정보 
 * */
public class Product<K ,M> {		//클래스안에다가 K나 M을 다루겠다 라고 말하는 것.
   private K kind;
   private M model;
   
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	} 
}
