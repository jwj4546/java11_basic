package sec1;

public class CalcExam1 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 20;
		
		Arithmatic a1 = new Arithmatic();
		a1.print();
		System.out.println("원주율 : "+a1.PI);
		System.out.println("덧셈 : "+a1.add(num1, num2));
		System.out.println("뺃셈 : "+a1.substract(num1, num2));
		System.out.println("곱셈 : "+a1.multiply(num1, num2));
		System.out.println("나눗셈 : "+a1.divide(num1, num2));
		System.out.println("거듭제곱 : "+a1.power(num1, num2));
	}
}
