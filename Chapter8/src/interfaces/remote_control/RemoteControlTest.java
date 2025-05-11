package interfaces.remote_control;



public class RemoteControlTest {

	public static void main(String[] args) {
		//부모 타입으로 객체 생성
		RemoteControl rcTV = new Television();
		rcTV.turnOn();
		rcTV.setVolume(11);
		//static 메서드이므로 인터페이스 이름으로 직접 접근
		rcTV.setMute(true);
		rcTV.setMute(false);
		RemoteControl.changeBattery(); 
		rcTV.turnOff();
		System.out.println("==================");
		RemoteControl rcAD = new Audio();
		rcAD.turnOn();
		rcAD.setVolume(-2);
		rcAD.turnOff();
		System.out.println("==================");
		
		
	}

}
