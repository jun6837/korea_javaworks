package loop;

public class WhileEx1 {

	public static void main(String[] args) {
		// 반복문 - 초기값, 종료값, 증감값
		int n = 1;
//		while ( n <= 10) { //종료값(종료식)
//			System.out.println("Hello~ " + n);
//		 n++; //n = n + 1, n += 1 // 증감값
//		}
		
    // 1~10 까지의 합계
	   int sum = 0; //합계를 저장할 변수
	   double average; 
	   while ( n<=10 ) {
		   sum += n; //sum = sum +n
		   System.out.println("n= "+ n +" sum = "+sum);
		   n++;
	   }
	   
	   average = (double)sum / (n-1);
	   System.out.println("합계= " + sum);
	   System.out.println("평균= "+ average);
	}

}
