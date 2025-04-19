package arrays;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 번호를 저장할 배열 생성
		int[] lotto = new int[6];
		
		//로또 번호 한개만 랜검하게 추출
	/*	lotto[0] =(int)(Math.random() * 45) + 1;
		System.out.println(lotto[0]);
*/
		//로또 번호를 저장
		for(int i = 0; i<lotto.length ; i++) {
			lotto[i] =(int)(Math.random() * 45) + 1;
			
			for(int j =0; j <i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			/*
			41 31 31 13 7
			
		    i = 0           41
		    i = 1  j = 0    31 / 41
			i = 2  j = 1    31 / 31 
			i = 2  j = 2    15
			i = 3  j =    
			*/
			
			}
		}
		//출력
		for(int i = 0; i<lotto.length ; i++) {
		System.out.print(lotto[i] + " ");
		}
		
	}

}
