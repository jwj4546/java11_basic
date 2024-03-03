package sec4;

public class Exam1 {
	public static void main(String[] args) {
		//Person p = new Person("James", 40, 1, true, 3);
		
		Person p = new Person();
		p.setName("James");
		p.setAge(40);
		p.setGender(1);
		p.setMaried(true);
		p.setChildAmount(3);
		p.print();
	}
}
