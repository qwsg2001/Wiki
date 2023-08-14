
public class ExceptionExamle {

	static void printLength(String data) throws ClassNotFoundException {

		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);

			Class.forName("Java.lang.String");
			System.out.println("Java.lang.String 클래스가 존재합니다.");
		} catch (NullPointerException e) {
//
//			e.printStackTrace();
//			System.out.println("널 문자가 전달되었다.");
//		} catch (ClassNotFoundException f) {
//			f.printStackTrace();
//		}catch(Exception a) {
//			a.printStackTrace();
//		}
//		finally {
			System.out.println("[마무리 실행]");
//
//		}

	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		printLength("This is Java");
		printLength(null);

		System.out.println("프로그램 종료");

	}

}
