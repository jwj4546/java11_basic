package org.kh.app2;

public class StarPrint9 {
	public static void main(String[] args) {
		for (int i=1;i<10;i=i+2) {
			for(int j=10;j>i;j=j-2) {
				System.out.print("  ");
			}	for(int k=0;k<i;k++) {
				System.out.print("*");
			}	System.out.println();
		}	
	}
}
