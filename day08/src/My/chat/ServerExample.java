package My.chat;

import java.net.ServerSocket;
import java.net.Socket;


public class ServerExample {

	//서버소켓
	static ServerExample server;
	
	static final int PORT = 50001;
	//소켓 
	Socket socket;
	
	

	
	
	
	
	
	
	
	
	
	
	
	


































	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========================================================");
		System.out.println("서버를 종료 하려면 q 또는 0을 입력하고 엔터를 입력하세요.");
		System.out.println("=========================================================");
	
		try {
		server = new ServerExample(PORT);
		System.out.println("서버 대기중~~~~~");
		
		socket = server.accept();
		
		
		}catch{
			a.printStackTrace();
		}
	}

















































	private Object accept() {
		// TODO Auto-generated method stub
		return null;
	}

}
