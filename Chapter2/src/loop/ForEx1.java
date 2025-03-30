package loop;

public class ForEx1 {

	public static void main(String[] args) {
		// 1~10
		int n;
		for(n=1; n<=10;n++) {
			System.out.println(n);
		}
		
		System.out.println();
		
		//1~10 합계와 평균
		int total = 0;
		for(n=1;n<=10;n++) {
			total = total + n;
		}
		System.out.println("합계는: "+total);
		double average = 0;
		average = (double)total / (n-1);
		System.out.println("평균은: "+average);
		 
	}

}
