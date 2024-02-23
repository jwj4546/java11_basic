package org.kh.object1;

public class PersonEx1 {
	public static void main(String[] args) {
		Person cho = new Person();
		cho.name = "조우진";
		cho.year = 1996;
		cho.gender = "남성";
		cho.job = "studnet";
		cho.running();
		
		
		Person lee= new Person();
		lee.running();
	}
}
