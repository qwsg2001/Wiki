package Exam4;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button button = new Button();
		
		class OKListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("OK버튼을 클릭했습니다.");
			}
		}
		button.setClickListener(new OKListener());
	}
	class OKListener implements Button.ClickListener{
		@Override
		public void onClick() {
			System.out.println("OK버튼을 클릭했습니다.");
		}
	}

}
