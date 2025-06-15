package socket1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSample {

	private static ServerSocket serverSocket;
	public static void main(String[] args) {

		System.out.println("============================================");
		System.out.println("서버를 종료하려면 q 또는 	Q를 입력하고 Enter를 누르세요.");
		System.out.println("============================================");

		startServer(); // 서버시작함수 호출
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			String key = scan.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}

		stopSever();
		scan.close();
	}

	private static void startServer() {
		// 작업 스레드 생성
		Thread thread = new Thread() {
			public void run() {
				try {
					serverSocket = new ServerSocket(8000);
					System.out.println("[서버] 시작됨");

					while(true) {
						System.out.println("[서버] 클라이언트의 연결 요청 기다림");
						Socket socket = serverSocket.accept();
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = isa.getHostString();
						System.out.println("[서버] "+ clientIp + "의 연결 요청을 수락함");
						socket.close();
						System.out.println("[서버] " + clientIp + "의 연결을 끊음");
					}
				} catch(IOException e) {
					System.out.println( "[서버] " + e.toString());

				}
			}		

		};
		thread.start();
	}
	private static void stopSever() {
		try {
			serverSocket.close();

		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}