package org.kh.app2;

public class StarPrint12 {
	public static void main(String[] args) {
		for(int i=1;i<8;i=i+2) {
			for(int j=10;j>i;j=j-2) {
				System.out.print("*");
			}for(int k=0;k<i*2;k=k+2) {
				System.out.print("  ");
			}	for(int n=10;n>i;n=n-2) {
				System.out.print("*");
			}	System.out.println();
		}
		for(int a=2;a<11;a=a+2) {
			for(int b=1;b<a;b=b+2) {
				System.out.print("*");
			}	for(int c=21;c>a*2;c=c-2) {
				System.out.print("  ");
			}	for(int d=1;d<a;d=d+2) {
				System.out.print("*");
			}	System.out.println();
		}
	}
}
