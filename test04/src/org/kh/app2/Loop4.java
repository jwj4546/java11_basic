package org.kh.app2;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
	/*for와 마찬가지로 조건이 만족하는 동안만 반복수행
	  그러나 while의 괄호에 조건만 기입하고, 해당 블록 안에 증감식이 기재됨.
	 초기식은 while문 시작 전에 해야함.
	 초기식;
	  while (조건식) {
	 		증감식;
	 		반복할 문장;
	 }
	 */
		int i = 0, tot = 0;
		while (i<5) {			//5
			i++;					//1	2	3	4	5
			tot = tot + i;		//1	3	6	10	15
		}
		System.out.println("결과 : "+tot);
		//해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력[2-9] : ");
		int n = sc.nextInt();		
		/*int j = 0;
		while (j<9) {
			j++;
			System.out.println(n+" * "+j+" = "+(n*j));*/
		for (int k=1; k<10; k++) {
			System.out.println(n+" * "+k+" = "+(n*k));
		}
		
	}
	

}
