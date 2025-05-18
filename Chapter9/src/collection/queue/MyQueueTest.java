package collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();
		
		//요소 추가- 순서(A -> B->C)
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		//요소 삭제
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
