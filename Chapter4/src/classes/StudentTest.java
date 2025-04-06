package classes;

public class StudentTest {

	public static void main(String[] args) {
		// 클래스의 인스턴스(객체) 생성
		Student s1 = new Student(); //s1 객체 생성
		Student s2 = new Student(1001, "최민우", 1); //s2 객체 생성
		
		
		s1.studentID = 1000;
		s1.name = "최준희";
		s1.grade = 3;
		
		
		
        //학생의 정보
		s1.studentInfo();
	    System.out.println();
        s2.studentInfo();
        
        //객체를 출력
        //클래스 이름 : 패키지이름.클래스이름
        System.out.println(s1);
        System.out.println(s2);
	}

}
