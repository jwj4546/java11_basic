package org.kh.app;
//조건문 if : if(조건식) {처리할 문장;}					//처리할 문장이 하나일 경우 '{}' 생략 가능
public class Condition {
	public static void main(String[] args) {
		int point = 80;
		String pass = "불합격";
		//판정(pass)은 점수(point)가 70 점 이상이면, "합격", 아니면 "불합격"
		if (point >= 70) pass = "합격";
//		if(point >= 70) {
//			pass = "합격";
//		}
//		if(point >= 70) {pass = "합격";		}
		System.out.printf("\n당신의 점수는 %d이고, 판정은 %s입니다.\n",point, pass);
		String pass2 = (point >= 70) ? "합격" : "불합격";
		System.out.println("점수 : "+point);
		System.out.println("합격 여부 : "+pass2);
	}
}
