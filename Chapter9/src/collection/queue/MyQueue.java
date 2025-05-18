package collection.queue;

import java.util.ArrayList;

public class MyQueue {
	private ArrayList<String> arrayQueue;
	
	public MyQueue() {
		arrayQueue = new ArrayList<String>();
	}
	
	//요소추가 -큐의 맨뒤에서 추가
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	// 요소삭제- 큐의 맨앞(인덱스 0)에서 삭제
	public String deQueue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}
	
}
