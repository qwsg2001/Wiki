import java.io.File;

import javax.imageio.stream.FileImageInputStream;

public class Myresource {

	private String name;
	private char[] read1;
	private char[] read2;

	public Myresource(String name) {
		this.name = name;
		System.out.println("[Myresource(+ name) 열기]");
	}

	public String read1() {
		System.out.println("[Myresource(+ name) 열기]");
		return "100";
	}

	public String read2() {
		System.out.println("[Myresource(+ name) 열기]");
		return "abc";
	}

	public void close()throws Exception{
		System.out.println("[Myresource(+ name) 열기]");
	}

	public static void mian(String[] args) {

		File file = new File("test.Txt");
		FileImageInputStream fis = null;
		
		try {
//			FileImageInputStream fis1 = new FileImageInputStream(file);
		} catch (IOExceptio io) {
			io.printStackTrace();
		} finally {
//			Object clone = file.clone();
		}
		Myresource myResource = new Myresource("test");
		System.out.println(myResource.read1);
		System.out.println(myResource.read2);

	}
}
