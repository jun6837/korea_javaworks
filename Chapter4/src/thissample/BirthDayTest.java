package thissample;

// private을 생략하면 default로  public과 유사
class Birthday {
	int year ,month, day;	

	public void setYear(int year) {
		this.year =year;
	}
	
    public void printThis() {
    	System.out.println(this);
    }
}




public class BirthDayTest {

	public static void main(String[] args) {
		// Birthday 객체 생성
		Birthday bDay = new Birthday();
		bDay.setYear(2020);
		
		System.out.println(bDay); //객체 출력
		bDay.printThis();
	}

}
