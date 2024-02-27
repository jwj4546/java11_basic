package sec2;

public class LunchExam1 {
	public static void main(String[] args) {
		Lunch lc;
		
		
		System.out.println("한식");
		lc = new Korean();
		lc.eating("김밥");
		
		System.out.println("\n일식");
		lc = new Japanese();
		lc.eating("소바");
		
		System.out.println("\n중식");
		lc = new Chinese();
		lc.eating("꿔바로우");
		
	}
}
