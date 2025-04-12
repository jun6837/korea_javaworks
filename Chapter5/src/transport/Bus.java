package transport;

public class Bus {
	// 버스 번호
	// 승객수
	// 버스의 수입
	private int busNumber;
	private int passenger;
	private int money;
	
	//생성자
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객을 태우는 메서드
	public void take(int money) {
		this.money += money; //this.money = this.money + money
		passenger++;
	}
	
	//버스의 정보
	public void busInfo() {
		System.out.println(busNumber + "번 버싀이 수입은 "+ money +
				 "원이고, 승객수는 " + passenger + "명 입니다.");
			}

}
