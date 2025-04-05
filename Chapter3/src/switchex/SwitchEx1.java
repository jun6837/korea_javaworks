package switchex;

public class SwitchEx1 {

	public static void main(String[] args) {
		// switch ~ case 구문
	
		String medalcolor = "Gold";
		
		switch(medalcolor) {
			case "Gold" :
				System.out.println("금메달 입니다.");
				break;
			
			case "Silver" :
				System.out.println("은메달 입니다.");
			break;
			case "Bronze" :
				System.out.println("동메달 입니다.");
			break;
	        default :
	        	System.out.println("메달이 없습니다.");
		
		
		}

	}

}
