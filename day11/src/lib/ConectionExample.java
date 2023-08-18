package lib;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConectionExample {

	public static void main(String[] args)throws SQLException{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "aiai";
		PreparedStatement pst = null;
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결성공");
			
			
			//users 테이블 사용자 정보 저장 
//			String sql = "INSERT INTO users(userid, username, userpassward, userage, userenail) "
//			+ " VALUES (?,?,?,?,?)";
//			
			//테이블에 새로운 게시물 정보 데이터 저장하기
			String sql2 = "INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata)"
					+ " VALUES (?,?,?,now(),?,?)";
			
			
			
			//전송객체
			pst = conn.prepareStatement(sql2,Statement.RETURN_GENERATED_KEYS);
//			pst1.setString(1, "Spring");
//			pst1.setString(2, "봄");
//			pst1.setString(3, "12345");
//			pst1.setInt(4, 30);
//			pst1.setString(5, "sp@a.net");
			
			pst.setString(1, "눈오는날");
			pst.setString(2, "함박눈이 내려요");
			pst.setString(3, "winter");
			pst.setString(4, "a.txt");
			pst.setBlob(5,new FileInputStream("a.txt"));
			

			//데이터 전송
		
			int n = pst.executeUpdate();
			
			if(n==1) {
				System.out.println("저장 성공");
				ResultSet rs = pst.getGeneratedKeys();
				
				if(rs.next()) {
				
					int no = rs.getInt(1);
					//String title = rs.getString("btitle");
					System.out.println("저장된 bno " + no);
					//System.out.println("저장된 bttile " + title);
					
				
				}
				
				
				rs.close();
				
			}else {
				System.out.println("저장 실패");
			}
			
			
			
		}catch(Exception e) {
			System.out.println("연결실패");
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("연결끊기.. ");
			}
		}
	}
}
