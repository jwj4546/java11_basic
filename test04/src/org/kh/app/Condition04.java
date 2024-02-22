package org.kh.app;

import java.util.Scanner;
//조건문 다단계 if  
public class Condition04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);					//키보드로부터 입력 받는 scanner 객체
		System.out.print("점수 입력[0-100] :");
		int point = scan.nextInt();											//문자열은 next()
		
		String result;
		String award;
		/*
		 97~100이면, 'A+', 93~96이면 'A0', 90~92이면 'A-'
		 87~90이면, 'B+', 83~86이면 'B0', 80~82이면 'B-' 
		 77~80이면, 'C+', 73~76이면 'C0', 70~72이면 'C-'
		 67~70이면, 'D+', 63~66이면 'D0', 60~62이면 'D-'
		 60미만은 F
		 */
		if (point >= 90) {
			result = "A";
		}
			else if (point >= 80) {
				result = "B";
		}	else if (point >= 70) {
				result = "C";
		}	else if (point >= 60) {
				result = "D";
		}	else {
				 result = "F";
		}
		if (point % 10 >= 7 || point == 100) {
			result = result + "+";
		}	else if (point % 10 >= 3) {
				result = result + "0";
		}	else if (point % 10 >= 0) {
				result = result + "-";
		}
		
		switch(result) {
			case "A+" : award = "학업우수상";
				break;
			case "A0" : award = "노력상";
				break;
			case "A-" : award = "아차상";
					break;
			default : award = "";
		}
		System.out.println("점수: "+point);
		System.out.println("학점: "+result);
		System.out.println("상: "+award);
		}
		
}