package test;

import java.util.Scanner;

public class CalorieExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int protein, carbohydrate, fat, calorie;
		
		System.out.print("protein : ");
		protein = sc.nextInt();
		System.out.print("carbohydrate : ");
		carbohydrate = sc.nextInt();
		System.out.print("fat : ");
		fat = sc.nextInt();
		calorie = protein * 4+carbohydrate * 4+fat*9;
		System.out.println("calorie : "+calorie);
	}

}
