package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		String name = "조우진";
		short age = 29;
		float height = 186.5f;
		double weight = 75.8;
		char init = 'c';
		
		System.out.printf("%n이름 : \" %s \"", name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %.3f", weight);
		System.out.println("\n이니셜 : "+ init);
		/* 이스케이프 문자
		 \n : 줄바꿈
		 \t : 탭
		 \\ : \를 출력
		 \" : "를 출력
		 \' : '를 출력 
		 - printf, println, print 다 사용할 수 있음
		 */
	}

}
