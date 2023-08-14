package shopingmall;

public class ChopLauncher {


public static void main(String[]args) {
		IShop shop = new Myshop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}
}
