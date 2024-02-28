package sec1;

public class BirthdayExam1 {

	public static void main(String[] args) {
		Birthday birth1 = new Birthday();
		birth1.setName("조우진");
		birth1.setYear(1996);
		birth1.setMonth(12);
		birth1.setDay(12);
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth2.setName("조우상");
		birth2.setYear(1999);
		birth2.setMonth(03);
		birth2.setDay(24);
		birth2.birth();
		birth2.birthAddr();
	}
}
