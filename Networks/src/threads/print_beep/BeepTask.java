package threads.print_beep;

import java.awt.Toolkit;

//Runnable 인터페이스를 구현하는 작업 스레드 구현 클래스 정
public class BeepTask implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 1; i<=5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
