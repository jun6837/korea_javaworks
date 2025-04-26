package statics;

public class MyMathTest {

	public static void main(String[] args) {
		// 수학관련 클래스 제공 받음
		// static을 포함한 메서드는 클래스 이름으로 직접 접근함(new 하지 않음)
		
		// 절대값 계산
		System.out.println("절대값: " + MyMath.MyAbs(-5));
		// 거듭제곱 계산
		System.out.println("거듭제곱: " + Math.pow(2, 3));
		System.out.println("거듭제곱: " + MyMath.Mypow(2, 3));
		
		//1부터 4까지 곱하기
		int gob = 1; // 곱하기의 초기화값은 1
		for(int i = 1; i <=4; i++) {
			gob *= i;  //gob = gob * i; // 1*2*3*4 =4!
		}
		System.out.println(gob);
	}

}
