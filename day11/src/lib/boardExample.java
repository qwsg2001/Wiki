package lib;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class boardExample {

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
			
			
			//board 테이블 사용자 정보 저장 
//			String sql = "INSERT INTO users(userid, username, userpassward, userage, userenail) "
//			+ " VALUES (?,?,?,?,?)";
//			
			//board bon 15인 정보 데이터 수정하기
			String sql2 = "UDATE boards SET btitle=?, bcontent=?,bname, bfiledata=? WHERE bno=3";
					
			
			
			//전송객체
//			pst1.setString(1, "Spring");
//			pst1.setString(2, "봄");
//			pst1.setString(3, "12345");
//			pst1.setInt(4, 30);
//			pst1.setString(5, "sp@a.net");
			
			pst = conn.prepareStatement(sql2);
			pst.setString(1, "눈사람");
			pst.setString(2, "눈으로 만드는 사람");
			pst.setString(1, "b.txt");
			pst.setBlob(5,new FileInputStream("a.txt"));
			pst.setInt(5,15);
			

			//데이터 전송
		
			int n = pst.executeUpdate();
			
			if(n==1) {
				System.out.println("수정 성공");
			}else {
				System.out.println("해당 번호는 존재하지 않습니다.");
			}
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
					coon.close();
					pst.close();
				}
				System.out.println("연결끊기.. ");
			}
		}
	}
}
