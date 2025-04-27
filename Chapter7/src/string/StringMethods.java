package string;

public class StringMethods {

	public static void main(String[] args) {
		// charAt(문자열)- 문자열에서 문자 추출
		// 문자열은 특별한 1차원 배열
        String msg = "행운을 빌어요";
        System.out.println(msg.charAt(0));
        System.out.println(msg.charAt(4));
        
        //주민번호에서 남여를 구분
        String jumin = "020615-3421234";
        char gender = jumin.charAt(7);
        
        switch(gender) {
        
        case '3':
        	System.out.println("남자입니다.");
        	break;
        	
        case '4':
        	System.out.println("여자입니다.");
        	break;
        	
        }
        // 여러개의 문자를 추출
        // 주민등록번호의 앞부분-firstNum, 뒷부분-secondNum
        String firstNum = jumin.substring(0, 6); // 끝인덱스 - 1추출
        System.out.println("생년월일: " +firstNum);
        String secondNum = jumin.substring(7);
        System.out.println("주민번호 뒷자리: " + secondNum);
        
        //indexOf(문자열) - 문자열이 시작되는 (첫)위치를 리턴하는 메서드
        //못찾으면 -1이 리턴됨
        
        String subject = "자바 프로그래밍 입문";
        int location1 = subject.indexOf("프로그래밍");
        System.out.println(location1);
        int location2 = subject.indexOf("코딩");
        System.out.println(location2); //-1
        //문자열 검색
        if(subject.indexOf("자바") != -1) {
        	System.out.println("자바 관련 서적");
        }else {
        	System.out.println("자바 비관련 서적");
        }
              
        
	}

}
