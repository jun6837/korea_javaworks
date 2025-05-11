package interfaces.remote_control;


public class SmartTVTest {

	public static void main(String[] args) {
		//인터페이스형(부모타입) 으로 객체 생성
		RemoteControl rc = new SmartTV();
		Searchable searchable = new SmartTV();
		SmartTV tv = new SmartTV();
		
		
		rc.turnOn();
		tv.search("www.naver.com");
		searchable.search("www.naver.com");
		RemoteControl.changeBattery();
	}

}
