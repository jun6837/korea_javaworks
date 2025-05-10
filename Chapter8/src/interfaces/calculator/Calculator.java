package interfaces.calculator;

public interface Calculator {
	//인터페이스 자료형에서 선언된 변수는 상수로 변환됨
	int ERROR = -9999;
	
	//모든 메서드가 추상 메서드이다.
	//정수형 계산기 구현 - 더하기, 빼기, 곱하기, 나누기
	//선언부만 있고 구현 블럭은 없다.
	int add(int n1, int n2);
	int subtract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
	

}
