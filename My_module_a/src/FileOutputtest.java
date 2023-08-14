import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.AbstractDocument.BranchElement;

public class FileOutputtest {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		FileOutputStream fous = new FileOutputStream(file);
		int data = 10;
		
		fous.write(data);
		
		FileOutputStream fis=null;
		}	
}
