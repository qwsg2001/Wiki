package Exampegenerice;
class TV{
	
}
class Car{
	
}
class Prodict <M, K>{
	private K Kind;
	private M model;
	
	K getKind(){
		return this.Kind;
	}
	
	M getmodel(){
		return this.model;
	}
	public  void setKind() {
		this.Kind = Kind;
	}
	public void setModel(String string) {
		this.model = (M) string;
	}
}
public class ProducTest {

	public static void main(String[] args) {
		Prodict<TV, String>product1 = new Prodict<>();
		product1.setKind();
		product1.setModel("스마트폰 TV");
		System.out.println("제품정보" + product1.getmodel());
	}
}
