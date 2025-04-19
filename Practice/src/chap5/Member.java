package chap5;

public class Member {
	   private String id;
	   private String password;
	   
	   public Member(String id, String password) {
		   this.id = id;
		   this.password = password;
	   }
	   
	   public void memberInfo() {
		   System.out.println("id: " + id +", " + "password: " + password);
	   }

}
