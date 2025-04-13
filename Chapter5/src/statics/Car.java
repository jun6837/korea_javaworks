package statics;

public class Car {
	//static이 붙은 변수(정적 변수)는 값을 공유 및 유지 한다.
	private static int serialNum = 1000;
	private int carNumber; //신차 번호
	
	public Car() {
		serialNum++;
		carNumber =serialNum;
		
	}
	
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	
	//차량 번호 가져오기	
	public int getCarnumber() {
		return carNumber;
	
		
	
		
	}

}
