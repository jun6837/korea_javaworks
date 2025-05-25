package enums;

import java.util.Calendar;

public class WeekTest {

	public static void main(String[] args) {
		Week today = null;
		
		//요일 - 인덱스(1,2,3)
		Calendar cal = Calendar.getInstance();
//		int week = cal.get(Calendar.DAY_OF_WEEK);
		int week = (int)(Math.random()*7)+1 ;
		System.out.println(week);
		//열거형 상수를 사용해서 요일을 출력하기
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			System.out.println("요일이 없습니다.");break;	
		
		}
		System.out.println("Today is " + today);
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 놀러 갑니다.");
		}else {
			System.out.println("평일에는 코딩합니다.");
		}
		
	}

}
