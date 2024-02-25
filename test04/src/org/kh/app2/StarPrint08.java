package org.kh.app2;

public class StarPrint08 {
	public static void main(String[] args) {
		for (int i=1;i<7;i++) {
			for (int j=6;j>i;j--) {
				System.out.print("  ");
			} for (int k=0;k<i;k++) {
				System.out.print("*");
			} System.out.println();
		} 
		for (int n=1;n<7;n++) {
			for(int m=0;m<n;m++) {
				System.out.print("  ");
			}	for (int l=6;l>n;l--) {
					System.out.print("*");
			} System.out.println();
		}
	}
}

