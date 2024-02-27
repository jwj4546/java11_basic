package sec2;

public class OverloadEx3 {
	public static void main(String[] args) {
		Board b0 = new Board();
		b0.setBno(1);
		b0.setTitle("java");
		b0.setUname("abc");
		
		Board b1 = new Board(101);
		b1.setTitle("평가");
		b1.setUname("weed");
		
		Board b2 = new Board(102);
		b2.setUname("ming");
		
		Board b3 = new Board(103, "주말 코딩", "wooji");
		
		Board b4 = new Board(104, "불금 코딩", "wooji", "자바 내용", "2024.02.23");
		
		Board b5 = new Board(104, "불금 코딩", "wooji", "자바 내용", "2024.02.23", 123);
		
		Notice n1 = new Notice(105, "불불", "wooji", "파이썬", "2024.02.27", 500);
		System.out.println(n1.toString());
		
		System.out.println(b5.toString());
		System.out.println(b4.toString());
		System.out.println(b3.toString());
		System.out.println(b2.toString());
		System.out.println(b1.toString());
		System.out.println(b0.toString());
	}
}
