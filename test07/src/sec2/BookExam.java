package sec2;

public class BookExam {
	public static void main(String[] args) {
		//100 개의 Book 배열 선언
		Book[] book = new Book[100];
		//for(int i=0;i<5;i++) {
		//book[i] = new Book("책 제목"+i, "저자"+i);
		book[0] = new Book("자바 프로그래밍", "박은종");
		book[1] = new Book("C", "김민지");
		book[2] = new Book("C++", "이씨쁠");
		book[3] = new Book("Go", "최고");
		book[4] = new Book("HTML", "이티엘");
		
		for(int i=0;i<5;i++) {
			System.out.println(book[i].toString());
		}
	}
}
