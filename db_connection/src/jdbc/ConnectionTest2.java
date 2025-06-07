package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class ConnectionTest2 {
	//static {} - 정적 영역 초기화 블럭
	static {
		try {
			//클래스 로딩시 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static String url = "jdbc:oracle:thin:@localhost:1521/xe"; //db url
	static String username = "system"; //user 계정
	static String password = "1234";
	
	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(url, username, password)) {
			System.out.println(conn + ": DB 연결 성공!");
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
	
		
		
		
	}

}
