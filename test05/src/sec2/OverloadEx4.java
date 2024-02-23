package sec2;

public class OverloadEx4 {
	public static void main(String[] args) {
		News n1 = new News(32);
		News n2 = new News(32, "ja");
		News n3 = new News(32, "ja", "va");
		News n4 = new News(32, "ja", "va", "ha", "ga");
		News n5 = new News(32, "ja", "va", "ha", "ga", 231);
		
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());
		System.out.println(n4.toString());
		System.out.println(n5.toString());
	}
}
