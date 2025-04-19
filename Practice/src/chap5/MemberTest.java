package chap5;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Member v1 = new Member("정은하","j1234");
		Member v2 = new Member("김우주","k0000");
		Member v3 = new Member("박하늘","p4320");
		
		System.out.println("********** 회원 현황 ***********");
		v1.memberInfo();
		v2.memberInfo();
		v3.memberInfo();
		*/
		
		Member[] members = new Member[3];
		members[0] = new Member("정은하","j1234");
		members[1] = new Member("김우주","k0000");
		members[2] = new Member("박하늘","p4320");
		System.out.println("********** 회원 현황 ***********");
		for (int i =0; i<members.length ; i++) {
			members[i].memberInfo();
		}
		
		//향상된 for 문
		//for(자료형 변수 : 배열이름){변수이름 출력}
		for(Member member : members)
			member.memberInfo();
	}

}
