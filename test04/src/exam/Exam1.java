package exam;
//Operator 값이 +, -, *, /인 경우에 사칙 연산을 수행하는 프로그램을 if~else if 문과
//switch~case문을 사용해 작성해 보세요
public class Exam1 {
	public static void main(String[] args) {
		int num1=10, num2=2;
		char operator = '+';
		
		int result = 0;
		//switch-case문
		switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("연산 오류");
		}
		System.out.println("연산결과 값 : "+result);
		
		//if~else if문
		if(operator == '+') {
			result = num1+num2;
		}	else if(operator == '-') {
			result = num1-num2;
		}	else if(operator == '*') {
			result = num1*num2;
		}	else if(operator == '/') {
			result = num1/num2;
		}	else {
			System.out.println("연산 오류");
		}
		System.out.println("연산결과 값 : "+result);
	}
}
