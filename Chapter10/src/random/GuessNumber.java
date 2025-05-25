package random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// 숫자 추측 게임
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int comNum = rnd.nextInt(30) + 1;
		
		while(true) {
			System.out.print("숫자(1~30)을 입력하세요: ");
			int guessNum = sc.nextInt();
			if ( guessNum < 1 || guessNum > 30) {
				System.out.println("유효햐지 않은 숫자입니다.");			
			} else if (guessNum == comNum) {
					System.out.println("정답!");
					break;
			} else if (guessNum > comNum) {
					System.out.println("너무 커요!");
				
			} else if (guessNum < comNum) {
					System.out.println("너무 작아요!");
				
			}
	    }
		
		sc.close();
	}

}
