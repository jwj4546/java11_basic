package sec1;

public class StudentExam {
	public static void main(String[] args) {
		Student s1 = new Student(1, 93, 72, 85);
		Student s2 = new Student(2, 53,23,67);
		Student s3 = new Student(3, 52, 77, 65);
		
		System.out.println(s1.toString());
		s1.print();
		System.out.println(s2.toString());
		s2.print();
		System.out.println(s3.toString());
		s3.print();
	}
}
