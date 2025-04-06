package methods;

public class ArrayParam {
    
	// 배열의 합계를 계산하는 함수
	public static int add(int[] scores) { //int[] scores = {1,2,3,4}
		int sum = 0;
		
		for(int i = 0; i<scores.length ; i++) {
			sum +=scores[i];
		}		
		
		return sum;		
	}
	
	
	// main함수
	public static void main(String[] args) {
		// 메서드의 매개 변수로 배열을 전달
		
		int[] numbers = {1,2,3,4};
        int total = add(numbers);
		
        System.out.println("합계 :" + total);
	}

}
