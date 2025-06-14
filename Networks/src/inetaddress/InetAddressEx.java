package inetaddress;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		//내컴퓨터 IP 주소 확인
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP: " + local.getHostAddress());
		//서버 컴퓨터
//			InetAddress server = InetAddress.getByName("www.naver.com");
//			System.out.println("네이버 서버 IP: " + server.getHostAddress());
			
			InetAddress[] servers = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : servers)
				System.out.println(remote);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
