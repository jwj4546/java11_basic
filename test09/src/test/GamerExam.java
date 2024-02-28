package test;

public class GamerExam {

	public static void main(String[] args) {
		Gamer gamer; 
		gamer = new Amateur();
		gamer.run(50);
		gamer.jump(2);
		gamer.turn(50);
		gamer.show("밍밍");
		
		System.out.println();
		
		
		gamer = new Progamer();
		gamer.run(100);
		gamer.jump(5);
		gamer.turn(100);
		gamer.show("Chovy");
	}

}
