package threads.print_beep;

public class PrintBeepTest2 {

	public static void main(String[] args) {
		//메인 스레드와 작업 스레드가 동시에 실행
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=1 ; i <=5 ; i++ ) {
			System.out.println("띵");
			//시간 대기 - Thread.sleep(1000)->1s
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		

	}

}
