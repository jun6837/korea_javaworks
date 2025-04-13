package inheritance;

public class Car {
	String brand;
	int cc;
	//매게변수가 있는 생성자
	Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;
	}
	//차의 정보 출력 메서드
	void carInfo() {
		System.out.println("모델명: " + brand);
		System.out.println("cc: " + cc);
		
	}

}
