package member;



// Member 클래스(참조 자료형) 만들기
public class Member {
	
	//회원 아이디
	private int memberId;
	//회원이름
	private String memberName;
	
	//생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	//설정자 메서드
	public void setmemberId(int memberId) {
		this.memberId = memberId;
	}
	//접근자 메서드
	public int getmemberId() {
		return memberId;
	}
	
	public void setmemberName(String memberName){
		this.memberName = memberName;
	}
	public String getmemberName() {
		return memberName;
		
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는  " + memberId + "입니다.";
	}
	
	
}
