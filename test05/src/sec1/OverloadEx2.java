package sec1;

public class OverloadEx2 {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBno(0);
		b1.setBname("밍프로그래밍");
		b1.setPrice(15000);
		b1.setAuthor("밍밍");
		b1.setPub("KH");
		
		Book b2 = new Book();
		b2.setBno(1);
		b2.setBname("정보처리 기사");
		b2.setPrice(20000);
		b2.setAuthor("정보");
		b2.setPub("기사");
		
		Book b3 = new Book();
		b3.setBno(2);
		b3.setBname("대화의 정석");
		b3.setPrice(5000);
		b3.setAuthor("대화");
		b3.setPub("정석");
		
		Book b4 = new Book();
		b4.print();
		b4.print(b1.getBno(),b1.getBname(), b1.getPrice());
		b4.print(b2.getBno(),b2.getBname(), b2.getPrice());
		b4.print(b3.getBno(),b3.getBname(), b3.getPrice());
	}

}
