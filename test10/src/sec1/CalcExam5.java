package sec1;

public class CalcExam5 {
	public static void main(String[] args) {
		Repeator rep1;
		
		int num1 = 100;
		int num2 = 3;
		
		rep1 = new Repeator() {
		
		public int multiply(int num1, int num2) {
			return num1*num2;
		}
		public int divide(int num1, int num2) {
			int su = 0;
			if(num1>num2) su = num1/num2;
			else su = num2/num1;
			return su;
		}
		int power(int num1, int num2) {
			int tmp= num1;
			for(int i=0;i<num2;i++) {
				num1 = num1*tmp;
			}
			return num1;
		}
		};
		System.out.println("원주율 : "+rep1.PI);
		System.out.println("덧셈 : "+rep1.add(num1, num2));
		System.out.println("뺃셈 : "+rep1.substract(num1, num2));
		System.out.println("곱셈 : "+rep1.multiply(num1, num2));
		System.out.println("나눗셈 : "+rep1.divide(num1, num2));
	}
}
