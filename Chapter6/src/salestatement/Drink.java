package salestatement;

public class Drink {
	//protected는 상속밥는 클래스에서만 접근이 가능하다.
	protected String name;
	protected int price;
	protected int count;
	
	public Drink(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	//금액계산
	public int calPrice() {
		return price * count;
	}
	
	static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	void printData() {
		System.out.println(name + "\t" + price +"\t" + count + "\t" + calPrice());
	}
	

}
 