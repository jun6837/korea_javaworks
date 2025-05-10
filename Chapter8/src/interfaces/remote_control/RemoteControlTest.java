package interfaces.remote_control;

public class RemoteControlTest {

	public static void main(String[] args) {
		//부모 타입으로 객체 생성
		RemoteControl rcTV = new Television();
		rcTV.turnOn();
		rcTV.setVolume(-5);
		rcTV.turnOff();
	}

}
