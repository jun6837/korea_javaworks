package interfaces.bookshelf;

import java.util.ArrayList;

//책 제목을 저장할 선반 클래스 정의(ArrayList)
public class Shelf {
	
	protected  ArrayList<String> shelf; // 상속받은 자식 클래스만 접근 가능
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	public ArrayList<String> getShelf(){
		return shelf; 
	}
}
