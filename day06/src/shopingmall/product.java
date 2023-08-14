package shopingmall;

public abstract class product {

	String pname;
	int price;
	public void printDetail() {
		System.out.println("상품명 : " + pname + " , ");
		System.out.println("가격 : " + price + " , ");
	}
	
	public abstract void printExtra();

	
}
