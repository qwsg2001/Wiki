import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadertest { //2바이트 데이타 차리 입략 객체 read() ;
							   //2바이트 데이타 처리 출력 객체 write();
	
	public static void main(String[]args) throws IOException {
		FileReader fr = new FileReader("D:\\java\\workspace\\day08");
		BufferedReader br = new BufferedReader(fr);
		String result = null;
		int reusult;
		while((result = br.readLine())!=null) {
			System.out.println(result);
		
			
		}
		
		
	}
}
