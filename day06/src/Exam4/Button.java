package Exam4;

public class Button{

	static interface ClickListener {

	//추상 메소드
	void onClick();
	
	}

//필드
ClickListener clicklistener;

void setClickListener(ClickListener clicklistener) {
	this.clicklistener = clicklistener;
	
	}
void clic() {
	this.clicklistener.onClick();
	}
}
