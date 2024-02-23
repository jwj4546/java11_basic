package org.kh.object1;

public class ComputeEx01 {
	public static void main(String[] args) {
		Compute01 comp1 = new Compute01();
		comp1.fn1();					//메소드 호출
		
		comp1.fn2(4);
		
		int i = comp1.fn3();
		System.out.println(comp1.fn3());
		System.out.println(i);
		
		String pass = comp1.fn4(86);
		System.out.println(pass);
		fn1();
		fn2(200);
		System.out.println(fn3());
		System.out.println("원의 넓이 : "+fn4(3));
	}
	//함수(Function) : 정의 호출
	public static void fn1() {
		System.out.println("반환(x), 매개 변수(x)");
	}
	public static void fn2(int i) {
		System.out.println("입력 수 : "+i);
	}
	public static int fn3() {
		return 500;
	}
	public static double fn4(int radius) {
		return radius * radius * 3.1415f;
	}
}
