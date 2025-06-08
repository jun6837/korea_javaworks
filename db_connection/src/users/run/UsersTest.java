package users.run;

import java.util.List;

import users.domain.Users;
import users.domain.UsersDAO;

public class UsersTest {

	public static void main(String[] args) {
	 Users user = new Users();      // Users 객체 생성
	 UsersDAO dao = new UsersDAO(); // 관리객체 생성
//	 user.setuserId("cloud");
//	 user.setUserPasdword("c1357!");
//	 user.setUserName("흰구름");
//	 user.setUserAge(100);
//	 
//	 dao.insertUser(user);
//	 System.out.println(user.getuserId()); 
	 
//	 System.out.println(user);
	 //회원 수정
//	 Users renewUser = new Users();
//	 renewUser.setuserId("today");
//	 renewUser.setuserPassword("t1357!");
//	 renewUser.setUserName("이종범");
//	 renewUser.setUserAge(50);
//	 dao.updateUser(renewUser);
	 //회원삭제
	 
	 dao.deleteUser("cloud");
	 
	 
	 List<Users> userList = dao.getUserList();
	 for(int i=0; i <userList.size(); i++) {
		 Users findUsers = userList.get(i);
		 System.out.println(findUsers);
	 }
	
	 //회원 상세 보기
//	 Users getUser = dao.getUsers("korea");
//	 System.out.println(getUser);
	}
	
}
	
