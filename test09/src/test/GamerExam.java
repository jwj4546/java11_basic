package test;

public class GamerExam {

	public static void main(String[] args) {
		Gamer ama; 
		ama = new Amateur();
		ama.run(50);
		ama.jump(2);
		ama.turn(50);
		ama.show("밍밍");
		
		System.out.println();
		
		Gamer pro;
		pro = new Progamer();
		pro.run(100);
		pro.jump(5);
		pro.turn(100);
		pro.show("Chovy");
	}

}
