package chap3;

public class Sum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1;
		int sum = 0;
		
		while(true) {						
			sum = sum +n ;
			if (sum>100)
				break;
			n++;
		}
			
				
		System.out.println("n = " + n);
		System.out.println("sum = " + sum);

	}

}
