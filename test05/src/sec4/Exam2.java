package sec4;

public class Exam2 {

	public static void main(String[] args) {
		Purchase pur = new Purchase("201803120001", "abc123", "2018년 3월 12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		System.out.println(pur.toString());
	}
}
