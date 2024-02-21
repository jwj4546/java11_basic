package org.kh.app;

import java.util.Scanner;
//조건문 다단계 if  
public class Condition4 {
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
		if (point >=  90) 
			if(point >= 97) {
				result = "A+";			
		}	else if (point >= 93) {
			result = "A0";
		}	else {
			result = "A-";
		}
		else if (point >=  80) 
			if(point >= 87) {
					result = "B+";			
		}	else if (point >= 83) {
				result = "B0";
		}	else {
				result = "B-";
		}
		else if (point >=  70) 
			if(point >= 77) {
				result = "C+";			
		}	else if (point >= 73) {
			result = "C0";	
		}	else {
			result = "C-";
		}
		else if (point >=  60) 
			if(point >= 67) {
				result = "D+";			
		}	else if (point >= 63) {
			result = "D0";
		}	else {
			result = "D-";
		}
		else {
			result = "F";
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
