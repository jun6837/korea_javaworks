package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		// 성적 처리 프로그램
		boolean run = true; // 프로그램 시작과 종료 - 스위치 변수
		int studentNum = 0; // 학생수    
		int scores[] = null;// 점수를 저장할 배열
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("=====================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("=====================================================");
			System.out.print("선택 > ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("학생수> ");
			    studentNum = sc.nextInt();
			    scores = new int[studentNum];
			    break;
			case 2:
				for(int i=0; i<scores.length;i++) {
					System.out.print("scores["+i+"]"+">");
					scores[i] = sc.nextInt(); // 점수입력
					}
				break;
			case 3:
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+i+"]"+" = " + scores[i]);
										}
				break;				
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run= false;
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시선택하세요");
				break;
			}
			
		}
		
		
		
		
sc.close();
	}
   
}
