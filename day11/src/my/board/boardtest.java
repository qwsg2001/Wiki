package my.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class boardtest {

	//필드
	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/mydb";
	String id = "root";
	String pwd = "aiai";
	
	PreparedStatement pst = null;
	ResultSet rs = null;
	private String sql;
	public void boardTest() {
		connect();
	}
		private void connect() {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결성공");		
		}
		catch{
			e.getMessage();
		}
		}
public void list() {
		connect();
		try {
			sql = "SELECT bno,btitle,bcontent,bdate, FROM boards ORDER BY bno DESC";
			pst = con.prepareStatement(sql);
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String no = rs.getString(2);
				String title = rs.getString(2);
				String content =rs.getString(4);
				java.sql.date = rs.getDate(5);
				
				board board2 = new board(no,title,content,writer);
				
			}catch(Exception e) {
				e.getMessage();
			}
		
		}
}
















	public static void main(String[]args) {
		
	}
}
