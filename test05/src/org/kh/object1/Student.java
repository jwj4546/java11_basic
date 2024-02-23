package org.kh.object1;

public class Student {
	String name = "조우진";
	int kor = 100;
	int eng = 100;
	int mat = 100;
	int tot() {
		return this.kor+this.eng+this.mat;
	}
	float avg() {
		return (this.kor+this.eng+this.mat)/3.0f;
	}
	void resulting() {
		System.out.println("이름: "+this.name+"\n총점: "+this.tot()+"\n평균: "+this.avg());
	}	
}
