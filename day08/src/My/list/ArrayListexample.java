package My.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Board{
	private String subject;
	private String content;
	private String writer;
	
	
	//인자 생성자..
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}	
}


public class ArrayListexample {

	public static void main(String[] args) {
		// 제너릭 타입
		List<Board> list = new ArrayList();
		//백터
		//Vector<Board> list = new Vector<Board>();
		
		Thread thread = new Thread() {
			public void run() {
				for(int i = 0; i<1000; i++){
					list.add(new Board("제목" + i, "내용" + i,  "글쓴이" + i));
					
				}
			}
		};
		
//		Thread thread2 = new Thread();
//		thread2.start();
		//작업 스레드들이 모두 종료될때 까지 메인 ㄴ스레드를 기다리게 함
		
		try {
			thread.join();
			thread.join();
			
		}catch(Exception e) {
			
		}
//		
//		list.add(new Board("제목1", "내용1", "작성자1"));
//		
//		List<Board> list1 = new ArrayList();
//		list1.add(new Board("제목2", "내용2", "작성자2"));
//		
//		List<Board> list2 = new ArrayList();
//		list2.add(new Board("제목3", "내용3", "작성자3"));
//		
//		List<Board> list3 = new ArrayList();
//		list.add(new Board("제목4", "내용4", "작성자4"));
//		
//		List<Board> list4 = new ArrayList();
//		list.add(new Board("제목5", "내용5", "작성자5"));
		
		int n = list.size();
		System.out.println("총 객체 수 : " + n);
		
//		//특정 인덱스 객체 가져오기
//		Board board = list.get(2);
//		System.out.println(board.getSubject() + "\t"+board.getContent()+"\t" + board.getWriter());
		
//		//모든 객체를 하나씩 가져오기 
//		for(int i = 0; i < list.size(); i++) {
//			Board b = list.get(i);
//			System.out.println(b.getSubject() + "\t"+b.getContent()+"\t" + b.getWriter());
//		}
		
//		System.out.println();
//		
//		//객체 삭제
//		list.remove(2);
//		list.remove(2);
		
		System.out.println();
		//foreach문
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t"+b.getContent()+"\t" + b.getWriter());

		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
