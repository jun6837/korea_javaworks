package generic.box;

public class BoxTest {

	public static void main(String[] args) {
		//string 형
		Box<String> box1 = new Box<String>();
		box1.set("행운을 빌어요");
		String msg = box1.get();
		System.out.println(msg);
		
		//integer 형
		Box<Integer> box2 = new Box<Integer>();
		box2.set(100);
		Integer num = box2.get();
		System.out.println(num);
		
		//참조 자료형
		Box<Car> box3 = new Box<Car>();
		box3.set(new Car("아이오닉5"));
		Car car = box3.get();
		System.out.println(car);
		
	}

}
