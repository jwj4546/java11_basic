package sec1;

import java.util.Scanner;
//객체 배열
public class StudentExam2 {
	public static void main(String[] args) {
		//5명의 학생 배열 객체 선언
		//int[] arr = {5, 3, 8, 7, 2, 1};
		Student[] s = new Student[5];	//s[0].kor, s[0].eng ~ s[4].kor, s[4].eng...
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			s[i] = new Student();			//개별 객체 생성
			s[i].setNum(i+1);
			System.out.print((i+1)+"번째 국어 : ");
			s[i].setKor(scan.nextInt());			
			System.out.print((i+1)+"번째 영어 : ");
			s[i].setEng(scan.nextInt());
			System.out.print((i+1)+"번째 수학 : ");
			s[i].setMat(scan.nextInt());			
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for(int i=0;i<5;i++) {
			s[i].resulting();
		}
	}
}
