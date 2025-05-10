package abstract_class.car;

public class CarTest {

	public static void main(String[] args) {

		System.out.println("======사람이 운전하는 자동차======");

//		Car car = new Car(); //추상클래슨느 객체를 생성할 수 없음
		//부모타입으로 객체 생성 - 다형성
		Car hiscar = new HumanCar();
//		hiscar.startCar();
//		hiscar.drive();
//		hiscar.stop();
//		hiscar.turnoff();
		hiscar.run();
		
		System.out.println("======자율 주행하는 자동차======");
		Car myCar = new AICar();
//		myCar.startCar();
//		myCar.drive();
//		myCar.stop();
//		myCar.turnoff();
		myCar.run();
	}

}
