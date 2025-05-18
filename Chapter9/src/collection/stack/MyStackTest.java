package collection.stack;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		//요소 넣기 (0-강아지)
		stack.push("강아지");
		stack.push("고앙이");
		stack.push("소");
		//요소의 개수
		System.out.println("요소의 총 개수: " + stack.getSize());
		
		//요소의 삭제(꺼내기) 
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
	    System.out.println(stack.pop());
		
	}

}
