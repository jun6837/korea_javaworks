package salestatement;

public class Alcohol extends Drink {

	private float alcper;
	public Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		// TODO Auto-generated constructor stub
		this.alcper = alcper;
	}
	//메서드 재정의
	static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}
	//메서드 재정의
	@Override
	void printData() {
		System.out.println(name + "(" + alcper +")\t" +"\t" + price +"\t" + count + "\t" + calPrice());
		
	}
	
	

}
