package methods;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Calendar cal = Calendar.getInstance();
	System.out.println(cal);
	
	//날짜와 시간
	System.out.println(cal.getTime());
	
	// 현재시간 - ms
	System.out.println(cal.getTimeInMillis());
	System.out.println(cal.getTimeInMillis()/(24*60*60*1000)); //일로 환선
	System.out.println(cal.getTimeInMillis()/(24*60*60*1000)/365); //연으로 환선
	
	
	//날짜 - 년, 월, 일
	int year = cal.get(Calendar.YEAR); //상수표기 = YEAR
	System.out.println(year + "년");
	
	int month = cal.get(Calendar.MONTH) + 1;
	System.out.println(month + "월");
	
	int date = cal.get(Calendar.DATE);
	System.out.println(date + "일");
	
	int hour = cal.get(Calendar.HOUR);
	int minute = cal.get(Calendar.MINUTE);
	int second = cal.get(Calendar.SECOND);
	System.out.println(hour + "시");
	System.out.println(minute + "분");
	System.out.println(second + "초");
	//요일 1:일 2:월 3:화 4:수 5: 목 6: 금 7: 토
	int day = cal.get(Calendar.DAY_OF_WEEK);
	System.out.println(day);
	
	String[] days = new String[] {"일요일" ,"월요일", "화요일", "수요일", 
			"목요일", "금요일", "토요일"  };
	System.out.println("오늘은 " + days[day-1] +" 입니다."); 
	}
}
