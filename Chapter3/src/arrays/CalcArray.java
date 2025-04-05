package arrays;

public class CalcArray {

	public static void main(String[] args) {
		// 정수형 배열을 생성하고 연산
		// 합계와 총점
		int[] score = new int[] {75, 90, 80, 60};
		int sum = 0;
		float avg ;
		
		for (int i=0; i < score.length; i++) {
		sum += score[i];	
		}
		avg = (float)sum / score.length;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
	//소수 자리수 prinf() 대응서식 %d- 정수, %f-실수, %s-문자
	System.out.printf("평균: %.1f\n", avg);
	
	//최대값, 최소값
	int max = score[0]; // 배열의 첫번째 값을 최대값으로 설정한다.
	for (int i=0; i < score.length; i++) {
		if (score[i]>max) {
			max = score[i];
		}
			
		
	}
//	System.out.println();
	System.out.println("최고 점수 : " + max);
	
	
	}

}
