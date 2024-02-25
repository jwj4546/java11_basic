package org.kh.app2;

public class StarPrint10 {
	public static void main(String[] args) {
		for(int i=1;i<10;i=i+2) {
			for(int j=0;j<i;j=j+2) {
				System.out.print("  ");
			}	for(int k=10;k>i;k--) {
				System.out.print("*");
			}	System.out.println();
		}	
	}
}
