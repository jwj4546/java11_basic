package org.kh.object1;

public class Compute01 {
	void fn1() {					//반환(x), 매개변수(x)
		System.out.println("function");
	}
	void fn2(int i) {			//반환(x), 매개변수(o)
		System.out.println(i+"를 입력하셨습니다.");
	}
	int fn3() {					//반환(o), 매개변수(x)
		return 1004;
	}
	String fn4(int point) {	//반환(o), 매개변수(o)
		if (point>=90) return "합격";
		else return "불합격";
	}
	
}
