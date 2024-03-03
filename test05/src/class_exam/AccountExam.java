package class_exam;

public class AccountExam {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccId(1212);
		a1.setName("조우진");
		a1.setBankName("신한은행");
		a1.setBalance(200000);
		System.out.println(a1.toString());
		System.out.println(a1.getAccId());
		
		Account a2 = new Account(411, "김지민", "신한은행", 200000);
		System.out.println(a2.toString());
	}

}
