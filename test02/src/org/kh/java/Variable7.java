package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
		String name = "조우진";
		Integer age = 29;
		String age2 = "29";
		int age3 = Integer.parseInt(age2) + 8;
		Float height = 186.5f;
		String height2 = "186.5";
		float height3 = Float.parseFloat(height2) + 3;
		//boolean pass = true;
		Double weight = 75.8;
		
		System.out.println("age : "+age3);
		System.out.println("height : "+height3);
		System.out.println("name : "+name.getClass().getName());
		System.out.println("age : "+age.getClass().getName());
		System.out.println("height : "+height.getClass().getName());
		System.out.println("weight : "+weight.getClass().getName());
		//primitive type => Wrapper type => boxing
		//Wrapper type => primitive type => unboxing
	}
}
