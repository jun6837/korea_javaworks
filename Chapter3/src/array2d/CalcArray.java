package array2d;

public class CalcArray {

	public static void main(String[] args) {
		// 2차원 정수형 배열 생성
		int [][] numbers = {
				{1,2,3,4},
				{5,6,7}
				};
		
		//특정 요소 검색 - 인텍싱
		int sum  = 0;
		int count = 0;
		double avg;
		
		int x = numbers[1][1];
		System.out.println(x);
		
		// 전체 검색
		
		for(int i = 0; i <numbers.length ; i++) {
			for(int j = 0; j<numbers[i].length ; j++) {
				System.out.print(numbers[i][j] + " ");
				count ++; // for문 수행할때 1씩 증가
			}
		}
		System.out.println();
		
		
		// 요소의 검색
		
				for(int i = 0; i <numbers.length ; i++) {
					for(int j = 0; j<numbers[i].length ; j++) {
				         sum += numbers[i][j];
					}
				}
        // 평균
	    avg = sum / count;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
