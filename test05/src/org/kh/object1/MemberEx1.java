package org.kh.object1;
//public > protected > default > private
//*		동일/상속/연관 	동일		현재 클래스
public class MemberEx1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setName("조우진");
		mem1.setId("cho");
		mem1.setPw("1212");
		mem1.setEmail("jwj4546@naver.com");
		mem1.setBirth(1996);
		mem1.setTel("01033479535");
		System.out.println("id : "+mem1.getId());
		System.out.println("pw : "+mem1.getPw());
		System.out.println(mem1.toString());
	}	

}
