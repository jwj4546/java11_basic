package exam;

public class Exam5 {
	public static void main(String[] args) {
		for(int i=1;i<8;i++) {
			if(i<=4) {
			for(int j=4-i;j>0;j--) {
				System.out.print("  ");
			}	for(int j=1;j<i*2;j++) {
				System.out.print("*");
				}
			}	
			else {
				for(int j=1;j<i-3;j++) {
					System.out.print("  ");
				}	for(int j=7;j>i*2;j--) {
					System.out.println("*");
				}	
			} System.out.println();
		}	
	}
}
