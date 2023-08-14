package shopingmall;

import java.util.ArrayList;
import java.util.Scanner;

public class Myshop implements IShop{

	User[] users = new User[2];
	
	
	product[] products = new product[4];
	
	ArrayList<product> cart = new ArrayList<product>();
	
	Scanner scan = new Scanner(System.in);
	
	int selUser;
	
	String title;

	
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		User user = new User("홍길동", PayType.CARAD);
		users[0] = user;
		user = new User("블로거",PayType.CASH);
		users[1] = user;
	}

	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		cellphone cp = new cellphone("갤럭시 노트5",100000, "SKT");
		products[0] = cp;
		cp = new cellphone("애플 아이폰7", 980000, "KT");
		products[1] = cp;
		smartTv st = new smartTv("삼성 3D Smart TV",5000000, "4K");
		products[2] = st;
		st = new smartTv("LG Smarat TV", 250000, "Full HD");
		products[3] = st;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("=================================");
		int i =0;
		
		for(User u : users) {
			System.out.printf("[%d]%s(%s)\n", i++, u.getName(),u.getPayType());
		}
		System.out.println("[x]종료");
		System.out.println("선택 : ");
		String sel = scan.next();
		System.out.println("## " + sel + "선택  ##");
		
		switch(sel) {
		case "X":System.exit(0);break;
		default:
			selUser = Integer.parseInt(sel);
			productList();
		}
	}

	private void productList() {
		// TODO Auto-generated method stub
		System.out.println(title + " : 상품목록 - 상품 선택");
		System.out.println("======================================");
		int i = 0;
		
		for(product p : products) {
			System.out.println("[" + i + "]");
			p.printDetail();
			i++;
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.println("선택 : ");
		String sel = scan.next();
		System.out.println("## " + sel + "선택 ##");
		
		switch(sel) {
		case "h" : start(); break;
		case "C" : checkOut(); break;
		default:
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
		}
		
	}

	private void checkOut() {
		// TODO Auto-generated method stub
		System.out.println(title + " : 체크아웃");
		System.out.println("========================");
		int total = 0;
		int i =0;
		
		for(product p : cart) {
			System.out.printf("[%d]%s(%s)\n", i++, p.pname,p.price);
			total = total +p.price;
		}
		System.out.println("===========================");
		
		System.out.println("결제방법 : " + users[selUser].getPayType());
		
		System.out.println("합계 : " + total + "원 입니다.");
		System.out.println("[p]이전, [q]결제완료");
		System.out.println("선택 : ");
		String sel = scan.next();
		switch(sel) {
		case "q":
			System.out.println("## 결제가 완료 되었습니다. 종료합니다. ##");
			System.exit(0); break;
		case "p":productList();break;
		default:
			checkOut();
		}
	}
	

	

}
