package generic.box2;

import generic.box.Car;

public class BoxTest {

	public static void main(String[] args) {

		//String 타입
		Box box1 = new Box();
		box1.set("GoodLuck");
		
		//String이 Object 보다 작으므로 형 변환 필요
		String msg =  (String) box1.get();
		
		//참조 자료형
		Box box2 = new Box();
		box2.set(new Car("EV4"));
		
		Car car = (Car) box2.get();
		System.out.println(car);
	}

}
