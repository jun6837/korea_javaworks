package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 난수 생성
		int n1 = (int)(Math.random() * 2); // 0~1
		System.out.println(n1);
		
		// 난수 생성 - Random() 클래스
		Random rnd = new Random();
//		rnd.setSeed(100); // 시드값 설정
//		System.out.println(rnd.nextInt());
		int n2 = rnd.nextInt(2);
		System.out.println(n2); // 0~1
		
		//동전 던지기
		int coin = rnd.nextInt(2) + 1;
		if (coin == 1) {
			System.out.println("앞면");
		}else {
			System.out.println("뒷면");
		}
		
		//주사위 2개 10번 던지기
		//중복 되면 "Double Thrown", 그 합이 7이면 "Seven Thrown", 10이면 "Ten Thrown"
		System.out.println("***주사위 2개 10번 던지기***");
		Random random = new Random();
		int dice1,dice2, total;
		
		for(int i =0; i <10; i++) {
			dice1 = random.nextInt(6) + 1;
			dice2 = random.nextInt(6) + 1;
			total = dice1 + dice2;
			System.out.print(dice1 +" "+ dice2 +" ");
			System.out.println("total : " +total);
			if(total == 7) {
				System.out.println("Seven Thrown");
			}
			if(total == 10) {
				System.out.println("Ten Thrown");
			}
			if (dice1 == dice2) {
				System.out.println("Double Thrown");
			}
		}
		

	}

}
