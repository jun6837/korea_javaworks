package collection.stack;

import java.util.ArrayList;

//문자열을 저장할 스택 구조(ArrayList로 구현) 클래스 생성
public class MyStack {
	
	private ArrayList<String> arrayStack;
	
	public MyStack() {
		arrayStack = new ArrayList<>();
	}
	
	//요소 넣기
	public void push(String data) {
		arrayStack.add(data);
	}
	//요소 개수
	public int getSize() {
		return  arrayStack.size();
	}
	
	
	//요소 삭제 
	public String pop() {
		int len = arrayStack.size();
		if(len ==0) {
			System.out.println("스택이 비었습니다.");
			return null;	
		}
		return arrayStack.remove(len - 1);
	}
}
