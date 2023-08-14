package shopingmall;

public class smartTv extends product{
	String resolution;
	
	public smartTv(String pname, int price, String resolutuon) {
		this.pname= pname;
		this.price = price;
		this.resolution = resolution;
	}
	@Override
	public void printExtra() {
		// TODO Auto-generated method stub
		System.out.println("해상도 : " + resolution);
	}

}
