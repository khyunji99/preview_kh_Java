package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = " 인수연 ";
		student1.address = "소하 2동 주민센터";
		
		System.out.println(student1.getStudentName());
		student1.showStudentInfor();
		
		Student student2 = new Student();
		student2.studentName = " 박성주 ";
		student2.address = "하안 5단지";
		
		System.out.println(student2.getStudentName());
		student2.showStudentInfor();
	}
}
