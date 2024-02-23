package sec1;

public class OverloadEx1 {
	public static void main(String[] args) {
		Product pro1 = new Product();
		pro1.print("밍밍봇", 231125123, 5000, 1);			//제품이름, 코드, 가격, 수량
		pro1.print("AI", 100);									//제품 설명, 제품 사이즈
	}
}
