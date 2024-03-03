package org.kh.app2;

public class StarPrint6 {

	public static void main(String[] args) {
		for (int i=1;i<12;i++) {
			if(i<7) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}	System.out.println();
			}	else if(i>6) {
				for(int j=6;j>i-6;j--) {
					System.out.print("*");
				}	System.out.println();
			}
		}	
	}
}