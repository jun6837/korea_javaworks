package salestatement;

public class SaleStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drink coffee = new Drink("커피", 2500, 4);
		Drink tea = new Drink("녹차", 3500, 3);
		Alcohol beer = new Alcohol("카스", 3500, 4, 2.5f);
		
		//음료 매출 전표 출력
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		System.out.println();
		//알콜 매출 전표 출력
		Alcohol.printTitle();
		beer.printData();
		
		int total = 0;
		total = coffee.calPrice() + tea.calPrice() + beer.calPrice();
		System.out.println();
		System.out.println("합계금액 : " + total + "원");

	}

}
