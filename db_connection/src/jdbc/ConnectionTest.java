package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		// 오라클 DBMS에 연결
		// 라이블러리 import 가 안되면, module-info.java 를 삭제한다.
		Connection conn = null;
		try {
			//jdbc 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			//연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", //db url
					"system", //user 계정
					"1234"); //password
			System.out.println(conn + "DB 연결 성공!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
