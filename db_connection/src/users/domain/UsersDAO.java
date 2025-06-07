package users.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO(Data Access Object) - 데이터베이스에 연결, 데이터를 생성, 
//                          조회, 수정, 삭제등의 작업을 하는 클래스
public class UsersDAO {
	//DB에 연결
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
	
	//회원 생성
	public void insertUser(Users users) {
		//SQL - DML (삽입구문)
		//? - 칼럼값을 칼럼명에 바인딩 시킴
		//Connection(db 연결), PrepareStatement(sql 작업) 객체 생성
		String sql = "INSERT INTO users(userid, userpassword, username , userage)"
				+ "VALUES (?,?,?,?)";
		try(Connection conn = DriverManager.getConnection(url,username, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setString(1,users.getuserId());  
				pstmt.setString(2,users.getUserPasdword());
				pstmt.setString(3,users.getUserName());
				pstmt.setInt(4,users.getUserAge());
				
				pstmt.execute(); //sql 실행(커밋과 같은 역할)
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//회원 목록 보기
	public List<Users> getUserList(){
		String sql = "SELECT * FROM users";
		List<Users> userList = new ArrayList<>();
		//결과 데이터를 가져올 객체 생성 - 
		try(Connection conn = DriverManager.getConnection(url,username, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			
				while(rs.next()) { //검색된 자료가 있는 동안 계속
					Users user = new Users();
					user.setuserId(rs.getString("userid")); //DB 에서 검색한 칼럼값
					user.setUserPasdword(rs.getString("userpassword"));
					user.setUserName(rs.getString("username"));
					user.setUserAge(rs.getInt("userage"));
					
					userList.add(user);
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		return userList;
	}
}
