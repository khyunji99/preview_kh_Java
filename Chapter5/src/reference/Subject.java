package reference;

public class Subject {
	
	String subjectName;
	int Score;

	/* construct 생성 */
	public Subject(String name) {
		subjectName = name;
	}
	
	public void setSubjectName(String name) {
		subjectName = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		this.Score = score;
	}

	public String getSubjectName() {
		return subjectName;
	}
	
	
}
