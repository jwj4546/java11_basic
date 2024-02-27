package sec1;

public class Birthday {
	private String Name;
	private int year;
	private int month;
	private int day;
	public String getName() {
		return Name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setName(String name) {
		Name = name;
	}
	public void birth() {
		System.out.println(this.year+"-"+this.month+"-"+this.day);
	}
	public void birthAddr() {
		System.out.println(this);
	}
}

