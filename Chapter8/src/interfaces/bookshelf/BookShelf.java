package interfaces.bookshelf;

public class BookShelf extends Shelf implements Queue{

	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	
	@Override
	public int getSize() {
		return shelf.size();
	}


	@Override
	public String deQueue() {
       int len = shelf.size();
       if (len == 0) {
    	   System.out.println("큐가 비었습니다.");
			return null;
       }
		return shelf.remove(0);
	}

}
