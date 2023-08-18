package day10;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class TClient extends JFrame implements MultiServer {

	
	private static Object btn1;
	private static Object jtf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setLayout(new BorderLayout(this));
		
		jp.add(jtf);
		jp.add(btn1);
		add(jta, "center");
		add(jp, "South");
		
		btn1.addActionListener(this);
		
		setTitle("머틸 채팅 프로그램 GUI버젼");
		setSize(500,500);
		
		setDefaultCloseOperation(JFram.EXIT_ON_CLOSE);
		
		sestVisible(true);
		
		Thread thread = new Thread(this);
		thread.start();
		
	}

	private static void setLayout(BorderLayout borderLayout) {
		// TODO Auto-generated method stub
		
	}
}
