package inheritance;

public class Taxi extends Car{
	int passenger;
	
	Taxi(String brand, int cc, int passenger){
		super(brand,cc); //부모 멤버 상속 
		this.passenger = passenger;
	}
	
	// 우클릭 > source > override
	@Override
	void carInfo() {
		// TODO Auto-generated method stub
		super.carInfo(); // 부모 메서드 상속 
		System.out.println("승객수 : " + passenger);
	}
	
	// 부모 메서드 재정의(오버라이딩 - Overriding)
	/*@Override
	void carInfo() {
		System.out.println("모델명 : " + brand);
		System.out.println("cc : " + cc);
		System.out.println("승객수 : " + passenger);
		
	}*/
	

}
