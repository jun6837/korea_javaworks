package users.run;

import java.util.List;

import users.domain.Users;
import users.domain.UsersDAO;

public class UsersTest {

	public static void main(String[] args) {
	 Users user = new Users();      // Users 객체 생성
	 UsersDAO dao = new UsersDAO(); // 관리객체 생성
	 user.setuserId("cloud");
	 user.setUserPasdword("c1357!");
	 user.setUserName("흰구름");
	 user.setUserAge(100);
	 
	 dao.insertUser(user);
//	 System.out.println(user.getuserId()); 
	 
//	 System.out.println(user);
	 List<Users> userList = dao.getUserList();
	 for(int i=0; i <userList.size(); i++) {
		 Users findUsers = userList.get(i);
		 System.out.println(findUsers);
	 }
	}

}
