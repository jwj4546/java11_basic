package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.14;
		int kor = 90, eng = 80, mat = 90;			//한번에 세개의 변수 선언 + 초기화 가능
		
//		float avg = (kor + eng + mat) / 3.0f;			//방법 1([정수 / 정수 = 정수값]이기 때문에 해당 방법으로 실수로 바꿔줌) - 바꿔주지 않으면 86.00으로 나옴
		float avg = (float)(kor + eng + mat) / 3;		//방법 2
		
		System.out.printf("\nf1 = %.3f", f1);
		System.out.printf("\nf2 = %.2f", f2);
		System.out.printf("\n평균: %.2f", avg);
		
	}

}
