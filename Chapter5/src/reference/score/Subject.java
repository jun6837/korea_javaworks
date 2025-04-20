package reference.score;

public class Subject {
	// 과목명
	// 과목점수
	private String subjectName;
	private int scorePoint;
	
	//과목 설정(setter)
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	
	//접근자(getter)
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScorepoint() {
		return scorePoint;
	}

}
