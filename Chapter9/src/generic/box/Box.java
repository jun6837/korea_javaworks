package generic.box;
// generic 타입을 사용한 클래스 정의
// T- type을 의미
public class Box<T> {

	private T type;
	
	public void set(T type) {
		this.type =type;
	}
	public T get() {
		return type;
	}
}
