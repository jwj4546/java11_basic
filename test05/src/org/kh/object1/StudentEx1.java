package org.kh.object1;

public class StudentEx1 {
	public static void main(String[] args) {
		Student cho = new Student();
		cho.name = "조우진";
		cho.kor = 92;
		cho.eng = 100;
		cho.mat = 80;
		cho.resulting();
		
		Student kim = new Student();
		kim.name = "김지연";
		kim.kor = 77;
		kim.eng = 88;
		kim.mat = 99;
		kim.resulting();
		
	}
		
}
