package sec4;

public class Purchase {
	private String no;
	private String id;
	private String date;
	private String name;
	private String pno;
	private String addr;
	
	public Purchase() { }
	
	public Purchase(String no, String id, String date, String name, String pno, String addr) {
		this.no = no;
		this.id = id;
		this.date = date;
		this.name = name;
		this.pno = pno;
		this.addr = addr;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "주문번호 : " + no + "\n주문자 아이디 : " + id + "\n주문 날짜 : " + date + "\n주문자 이름 : " + name + "\n주문 상품 번호 : " + pno + "\n배송 주소 : "
				+ addr;
	}
	
}
