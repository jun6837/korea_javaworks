package chap4;

public class MyAbs {

	//절대값 계산
	public static int myAbs(int x) {
		if (x<0) {
			return x * -1;
		} else {
			return x;
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int v1 = myAbs(-4);
       int v2 = myAbs(4);
		
       System.out.println("myAbs(-4) = " + v1);
       System.out.println("myAbs(4) = " + v2);
       
	}

}
