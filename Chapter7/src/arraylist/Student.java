package arraylist;

import java.util.ArrayList;

public class Student {

	/* Student 클래스의 속성 */
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; // 학생이 듣는 여러 과목들을 배열로 만든것.
	
	/* 학생 생성 */
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // subjectList는 Subject 요소들을 가지고 있는 아이이다.
	}
	
	// 학생이 어떤 과목을 수강했다. 그러면 이 내용들을 추가해줘야 한다. 추가되는 메서드 생성 //
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);	
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject subject : subjectList) { // subjectList를 처음부터 끝까지 돈다.
			total += subject.getScorePoint();
			
			System.out.println("학생 " + studentName + "님의 " + subject.getName() + " 과목의 성적은"
					+ subject.getScorePoint() + "점 입니다.");
		}
		
		System.out.println("학생 " + studentName + "님의 총점은 " + total + "점 입니다.");
	}
	
	
}
