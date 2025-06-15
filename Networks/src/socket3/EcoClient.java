package socket3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EcoClient {

	public static void main(String[] args) {
		// Socket 객체 생서오가 연결 요청
		try {
			Socket socket = new Socket("localhost",8000);
			System.out.println("[클라이언트] 연결 성공");
			
			//데이터 보내기
		    String sendMessage = "행운을 빌어요! Good Luck!";
		    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		    dos.writeUTF(sendMessage);
		    dos.flush();
		    
			
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 서버로 부터 데이터 받음: " + receiveMessage);
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
