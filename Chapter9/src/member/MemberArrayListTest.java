package member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// ArrayList를 활용한 회원 관리 프로그램
					
		// Member 객체 생성
		Member lee = new Member(1001,"이정후");
		Member shin = new Member(1002,"신유빈");
		Member choe	= new Member(1003,"최민정");
		
		// Member 관리 클래스(MemberArrayList) 객체 생성
		
		MemberArrayList memberList = new MemberArrayList();
		
		//회원 저장
		memberList.addMember(lee);
		memberList.addMember(shin);
		memberList.addMember(choe);
		
		//회원 삭제
		memberList.removeMember(1001);
		
		//회원 출력
		memberList.showMember();
		
//		System.out.println(shin);
		
		

	}

}
