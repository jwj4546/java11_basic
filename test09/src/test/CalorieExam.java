package test;

import java.util.Scanner;

public class CalorieExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int protein=4;
		int carbohydrate=4;
		int fat=9;
		int calorie;
		System.out.print("protein : ");
		int a = sc.nextInt();
		System.out.print("carbohydrate : ");
		int b = sc.nextInt();
		System.out.print("fat : ");
		int c = sc.nextInt();
		calorie = (protein * a)+(carbohydrate * b)+(fat*c);
		System.out.println("calorie : "+calorie);
	}

}
