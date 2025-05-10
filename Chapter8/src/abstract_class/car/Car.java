package abstract_class.car;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	public abstract void drive();
	public abstract void stop();
	
	//템플릿 메서드 - 전체 기능의 흐름(프로세스) 를 정의하는 메서드
	public final void run() {
		startCar();
		turnoff();
		drive();
		stop();
	}
	
	
}
