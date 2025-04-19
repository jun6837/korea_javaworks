package chap4;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	//	MyMath math = new MyMath();
//		int value1 = math.abs(-4);
//		System.out.println(value1);
//		
		int value1 = MyMath.abs(-8);
		System.out.println(value1);
		
		int value3 = Math.abs(-8);
		System.out.println(value3);
		
		//square 호출
		
		int value4 = MyMath.sq(8);
		System.out.println(value4);
	}

}
