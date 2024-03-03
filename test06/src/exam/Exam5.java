package exam;
/*
사람(Human)
별다방(StarCafe)
콩다방(BeanCafe)
메뉴(Menu) : 공유 대상(객체 간 협력 대상)
*/
class Menu {
	final static int STARAMEICANO=4000;
	final static int STARLATTE=4300;
	final static int STARMACCHIATO=4500;
	final static int BEANAMERICANO=4100;
	final static int BEANLATTE=4500;
	final static int BEANMACCHIATO=4800;
}
class Human {
	String name;
	int money;
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buyStarCafe(StarCafe sCafe, int money) {
		String msg = sCafe.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name+"님이"+money+"원을 지불하여 "+msg);
		}
	}
	
	public void buyBeanCafe(BeanCafe bCafe, int money) {
		String msg = bCafe.brewing(money);
		if(msg != null) {
			this.money -= money;
			System.out.println(name+"님이"+money+"원을 지불하여 "+msg);
		}
	}
}
class StarCafe {
	int money;
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.STARAMEICANO) {
			return "별 다방에서 아메리카노 구매";
		}	else if(money == Menu.STARLATTE) {
			return "별 다방에서 라떼 구매";
		}	else if(money == Menu.STARMACCHIATO) {
			return "별 다방에서 마끼아또 구매";
		}	else {
			return null;
		}
	}
}
class BeanCafe {
	int money;
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.BEANAMERICANO) {
			return "콩 다방에서 아메리카노 구매";
		}	else if(money == Menu.BEANLATTE) {
			return "콩 다방에서 라떼 구매";
		}	else if(money == Menu.BEANMACCHIATO) {
			return "콩 다방에서 마끼아또 구매";
		}	else {
			return null;
		}
	}
}

public class Exam5 {
	public static void main(String[] args) {
		Human h = new Human("조우진", 30000);
		
		StarCafe sCafe = new StarCafe();
		BeanCafe bCafe = new BeanCafe();
		
		h.buyStarCafe(sCafe, 4000);
		h.buyBeanCafe(bCafe, 4800);
		System.out.println(h.name+"님의 잔액은 "+h.money+" 입니다.");
	}

}
