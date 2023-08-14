package shopingmall;

public class cellphone extends product {

	String carrier;
	
	public cellphone(String pname, int price, String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}
	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.println("통신사 : " + carrier);
	}
}
