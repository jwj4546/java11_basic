package sec3;
//Protected : 같은 package 안에 있거나 상속(자식)을 받았을 때 사용 가능
//Default : 같은 package 내에서만 사용 가능
//Private : 하나의 클래스 내에서만 접근 가능
public class Birds extends Animal {
	protected int wings;
	protected boolean fly;
	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	@Override
	public String print() {
		return "Birds wings=["+wings+"], name=["+super.name+"]";
	}
}
