package sec2;

public class StudentExam1 {

	public static void main(String[] args) {
		Student s1 = new Student("조우진", 1, 100000);
		Student s2 = new Student("조우상", 2, 200000);
		Student s3 = new Student("김지민", 3, 300000);
	
		Bus bus1 = new Bus(101);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		
		//조우상 학생이 버스(101)를 두 번 이용하고, 지하철을 2호선 세 번 이용하였을 경우 
		//조우상 학생의 정보와 버스 101호 정보
		Subway sub2 = new Subway(2);
		s2.takeBus(bus1);
		s2.takeBus(bus1);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.takeSubway(sub2);
		s2.print();
		bus1.show();
		sub2.show();
	}
}
