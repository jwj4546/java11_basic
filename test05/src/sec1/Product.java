package sec1;

public class Product {
	private String pname;
	private int pcode;
	private int price;
	private int size;
	private int amount;
	private String remark;
	
	//메소드 오버로딩(Method Overloading)
	public void print() {
		System.out.println("제품정보");
	}
	public void print(String remark, int size) {
		System.out.println("제품 사이즈 : "+size);
		System.out.println("제품 설명 : "+remark);
	}
	public void print(String pname, int pcode, int price, int amount) {
		System.out.println("제품 이름 : "+pname);
		System.out.println("제품 코드 : "+pcode);
		System.out.println("제품 가격 : "+price);
		System.out.println("제품 수량 : "+amount);
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amount="
				+ amount + ", remark=" + remark + "]";
	}
	
}
