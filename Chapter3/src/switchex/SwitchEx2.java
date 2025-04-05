package switchex;

public class SwitchEx2 {

	public static void main(String[] args) {
		// case문 동시에 사용
		// 31일 - 1,3,5,7,8,10,12
		// 30일 - 4,6,9,11
		// 28일 - 2
		int month = 8;
		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2 :
			day = 28;
		    break;
		default :
			System.out.println("없는 달입니다.");
			break;
		}
		
		System.out.println(month + "월은 "+ day + "일까지 있습니다.");
		
				

	}

}
