package chap3;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	int[] arr  = new int[] {2,4,6,8,10};
	
	int total = 0;
	
	for(int i= 0; i < arr.length ; i++) {
	 total += arr[i];
	 
	}
	System.out.println("총합: " + total);
	System.out.println("평균: " + (double)total / arr.length);
	}

}
