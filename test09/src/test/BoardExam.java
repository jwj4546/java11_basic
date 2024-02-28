package test;

public class BoardExam {
	public static void main(String[] args) {
		Board[] bd = new Board[5];
		bd[0] = new Board();
		bd[1] = new Board();
		bd[2] = new Board();
		bd[3] = new Board();
		bd[4] = new Board();
		
		for(int i=0;i<5;i++) {
			System.out.println(bd[i].toString());
		}
	}

}
