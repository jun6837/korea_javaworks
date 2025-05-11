package interfaces.remote_control;

public interface RemoteControl {
	//인터페이스 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	// Default 메서드 - 실제 메서드에 default 키워들르 붙힘
	default void setMute(boolean mute) {
		if (mute) { //mute == true
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
}
