package reference;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(2,3,5);
		c1.showCircleInfo();
		System.out.printf("원의 넓이: %.2f\n" , c1.getArea());
		
		Circle c2 = new Circle(8,8,10);
		c2.showCircleInfo();
		System.out.printf("원의 넓이: %.2f\n" , c2.getArea());
	}

}
