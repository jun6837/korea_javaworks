package interfaces.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass myClass = new MyClass();
		
		//부모타입으로 형변환
		X x = myClass;
		x.x();
		Y y = myClass;
		y.y();
		
		//X와 Y를 상확한 iClass 객체 생성
		MyInterface iClass = myClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();

	}

}
