package choice;

import java.util.Scanner;

/*
 * 학점 계산 프로그램
 *  90 ~ 100점 : A
 *  80 ~ 89점 : B 
 *  70 ~ 79점 : C
 *  70 미만 : F  
 */
public class IfElseifElse {

	public static void main(String[] args) {
		// 다중 조건문
	    Scanner sc = new Scanner(System.in);
	    System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
//		int score = 86;
     	char grade = ' ';
    	
		
		if (score >= 90 && score <= 100) {
			grade = 'A';
		}else if (score >= 80){
			grade = 'B';
		}
//		else if (score >= 70){
//			grade = 'C';
//		}else {
//			grade = 'F';
//		}	
    System.out.println("학점은 " + grade + "입니다.");
    sc.close();
	}

}
