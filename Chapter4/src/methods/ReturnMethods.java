package methods;

public class ReturnMethods {

	//main() -프로그램을 실행하는 함수	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    int value = square(8); // square 함수 호출
    System.out.println(value); 
    
    double value2 = add(3.3, 4.4); //add 함수 호출
    System.out.println(value2);
       
	String message = msg(); //msg 함수 호촐
	System.out.println(message);
    
		
	}

	//제곱수를 개산하는 함수 - 매개변수(parameter) 1개
	public static int square(int x) {
		return  x * x;
	}
	
	//두 수를 더하는 함수 - 매개변수 2개
	public static double add(double x, double y) {
		return x + y;
	}
	
	// message를 출력하는 함수
	public static String msg() {
		return "생일 축하해요";
	}
	

}
