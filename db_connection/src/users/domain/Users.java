package users.domain;

public class Users {
	private String userId;
	private String userPasdword;
	private String userName;
	private int userAge;
	
	
//getter .setter
	public String getuserId() {
		return userId;
	}

	public void setuserId(String userId) {
		this.userId = userId;
	}


	public String getUserPasdword() {
		return userPasdword;
	}


	public void setUserPasdword(String userPasdword) {
		this.userPasdword = userPasdword;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userPasdword=" + userPasdword + ", userName=" + userName + ", userAge="
				+ userAge + "]";
	}
	
	
}
