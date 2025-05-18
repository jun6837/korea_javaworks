package interfaces.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("반응형 웹");
		shelfQueue.enQueue("혼공 JAVA");
		shelfQueue.enQueue("스트링부트");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());

	}

}
