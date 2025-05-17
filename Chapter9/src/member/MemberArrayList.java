package member;

import java.util.ArrayList;

//회원을 관리(추가, 조회, 삭제)하는 클래스
public class MemberArrayList {
	//ArrayList 선언
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	//회원추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	//회원조회
	public void showMember() {
		for(int i = 0; i<arrayList.size(); i++) {
			Member member =  arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원삭제
	public boolean removeMember(int memberId) {
		for(int i = 0; i< arrayList.size() ; i++) {
			//이미 등록된 memberId를 dbId에 저장
			int dbId = arrayList.get(i).getmemberId();
			if(dbId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
}
