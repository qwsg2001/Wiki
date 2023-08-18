package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UserselectExampe {

	// 필드선언
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	private String sql;
	private String url;
	private String id;
	private String pwd;



	public UserselectExampe() {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "aiai";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");

		} catch (Exception e) {
			e.getMessage();
			System.out.println("연결 실패");
		}
	}

	public ArrayList<User> SelectAll(){

		ArrayList<User>list = new ArrayList<>();

		sql = "SELECT * FROM users";
		try {
			pst= conn.prepareStatement(sql);

			rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String pwd = rs.getString(3);
				int age = rs.getInt(4);
				String maile = rs.getString(5);
	
				User user1 = new User(id,name,pwd,age,maile);

						list.add(user1);
			}
			}catch(SQLException e) {
				e.getMessage();
			}
		
	

		return list;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserselectExampe user = new UserselectExampe();
		ArrayList<User> n = user.SelectAll();
		for(User u : n) {
			System.out.println("아이디 : " + u.getUserid());
			System.out.println("이름 : " + u.getUsername());
			System.out.println("비밀번호: " + u.getUserpassward());
			System.out.println("나이 : " + u.getUserage());
			System.out.println("이메일 : " + u.getUserenail());
		}

		//저장 
		User user2 = new User("summer", "여름", "1234","30","e@namer.com");
		
		int result = user.userInsert(user);
		
		if(result == 1) {
			System.out.println("저장 성공");
		}else {
			System.out.println("저장 실패");
		}
	}

	private int userInsert(UserselectExampe user) {
		// TODO Auto-generated method stub
		int n = 0;
		
		sql = "INSESRT INTO users (userid,username,userpassward,userage,useremail)";
		
		try {
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, user.getUserid());
		}
		
	}

	private String getUserid() {
		// TODO Auto-generated method stub
		return null;
	}
}