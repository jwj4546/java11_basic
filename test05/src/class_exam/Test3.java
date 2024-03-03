package class_exam;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		
		m1.setName("홍길동");
		m1.setAge(25);																//class에서 int로 선언했으므로 숫자만 입력
		m1.setAddress("서울시 영등포구");
		m1.setHobby("독서");
		
		Member m2 = new Member();
		
		m2.setName("김미영");
		m2.setAge(20);																//class에서 int로 선언했으므로 숫자만 입력
		m2.setAddress("서울시 금천구");
		m2.setHobby("운동");
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(m1);
		list.add(m2);
		
		for(Member mem : list) {												//String => Member(class 로 선언해야함)	
			System.out.println("이름 : "+mem.getName());			
			System.out.println("나이 : "+mem.getAge());
			System.out.println("주소 : "+mem.getAddress());
			System.out.println("취미 : "+mem.getHobby());
		}
	}
}
