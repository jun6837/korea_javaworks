package variable;

public class Variable {

	public static void main(String[] args) {
		// 변수 선언과 초기화
		// 변수 - 자료를 저장하기 위한 공간, 자료를 변경할 수 있다
		String name; //자료형이 문자열인 name 이라는 변수를 선언
		int grade;   //정수형 변수 선언(int-integer)
		int ban = 3; //정수형 변수 선언과 초기화
		
		name = "이정후"; //변수에 값을 저장(초기화)
		grade = 2;
		
		System.out.println("이름: " + name); //'+' 연결 연산자(기호)
		System.out.println("학년: " + grade);
		System.out.println("반: " + ban);
				
		/*
		 *  변수 이름 작성시 주의 사항
		 *  1. 숫자로 시작하면 안됨
		 *  2. 공백문자가 들어가면 안됨
		 *  3. 예약어(자바에세 제공되는 키워드)사용할 수 없음
		 */
	
				
	}

}
