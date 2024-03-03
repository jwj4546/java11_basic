package class_exam;

public class CourseExam {
	public static void main(String[] args) {
		Course cor = new Course();
		cor.setCno(101);
		cor.setLector("조우진");
		
		System.out.println(cor.getCno());
		System.out.println(cor.getLector());
	}
}
