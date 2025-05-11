package generic.box;

public class Car {
	// default 멤버 변수
	// 다른 패키지에서 접근할 수 없음
	String name;
	
	public Car(String name){
		this.name = name;
	}

	//객체의 문자열 정보 변환
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
