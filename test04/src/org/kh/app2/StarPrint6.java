package org.kh.app2;

public class StarPrint6 {

	public static void main(String[] args) {
		for (int i=0;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}	System.out.println();
		}	for (int n=0;n<6;n++) {
				for(int m=6;m>n;m--) {
					System.out.print("*");
				}	System.out.println();
		}
	}	
		

}
