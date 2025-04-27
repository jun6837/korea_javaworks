package objects;

public class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}



	//객체 정보를 문자열로 출력
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		//instanceof - 클래스의 객체(인시던츠) 인지 확인 사용
		if (obj instanceof Book) {
			Book book =(Book)obj; //강제 타입 변환
			if(this.bookNumber == book.bookNumber) {
				return true;
			}
		}
		return false;
	}
	
	
}
