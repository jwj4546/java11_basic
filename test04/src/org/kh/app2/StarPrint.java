package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class StarPrint {
	public static void main(String[] args) {
		/*
		 
		  ******
		  ******
		  ******
		  ******
		 
		 */
		for(int i = 0;i<4;i++) {
			for(int j=0;j<6;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int n = 0;n<=6;n++) {
			for(int m=0;m<n;m++) {
				System.out.print("*");	
				
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------");
		for(int n = 0;n<=6;n++) {
			for(int m=6;m>n;m--) {
				System.out.print(" ");	
			}
		for(int l = 0; l<6;l++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
	}

}
