import java.util.ArrayList;

public class MainApp {
	
	static Movie movie;
	
	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		
		ArrayList<Movie> list = Movie.findAll();
		for(Movie m : list) {
			System.out.println(m.toString());

		}
		
		System.out.println("프로그램이 종료합니다.");
	}
}
