package reference.score;

public class Student {
	private int studentID;
	private String studentName;
	private Subject korean;
	private Subject math;
	
	//생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	
	//국어점수 설성
	public void setKoreanSubobject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//수학점수 설성
		public void setMathSubobject(String name, int score) {
			math.setSubjectName(name);
			math.setScorePoint(score);
		}
	//학새으이 정보 출력 메서드
		public void showStudentInfo() {
			System.out.println(
					"학번: " + studentID +
					"\n이름: " + studentName +
					"\n국어 점수: " + korean.getScorepoint() +
					"\n수학 점수: " + math.getScorepoint()
					);
			System.out.println("----------------------------------");
		}
		
}
