package loop;

public class WhileEx2 {

	public static void main(String[] args) {
		// 반복 조건문(while ~if ~ break)
		// 1부터 10 까지 출력
		int n = 1;
		
//		while (true) {
//			if(n > 10)
//							
//				break;
//			System.out.println(n);
//			n++;
//		}
        int sum = 0;
        double avg = 0.0;
        
        while(true) {
        	
        	if (n>10)
        		break;
        	sum += n;
        	n++;
        	
        }
        avg = (double)sum / (n-1);
		System.out.println(sum);
		System.out.println(avg);
	}

}
