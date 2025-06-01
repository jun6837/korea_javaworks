package typing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class TypingGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))){
			String str;
			String[] words = null; //분리된 단어을 저장할 배열
			
			while((str = br.readLine()) !=null) {
				words = str.split(" ");
				
			}
			//2. 영어 타자 게임
			int n = 1;  	     //문제 번호
			long start, end;     //시작, 종료시간
			double elapsedTime;  //소요 시간

			Scanner sc = new Scanner(System.in);
			System.out.println("[타자 게임], 준비되면 엔터>");
			sc.nextLine();  //엔터

			start = System.currentTimeMillis();  //1970. 1. 1 자정이후 밀리초(ms)
			//System.out.println(start); 1748663668694

			while(n < 11) {
				System.out.println("\n문제 " + n);
				Random rnd = new Random();
				int rndIdx = rnd.nextInt(words.length);
				String question = words[rndIdx];  //문제(랜덤 추출)
				System.out.println(question);

				String answer = sc.nextLine();  //사용자 단어 입력
				//question과 answer 비교
				if(answer.equals(question)) {
					System.out.println("통과!");
					n++;  //다음 문제
				}else {
					System.out.println("오타! 다시 도전!");
				}
			} //while 닫기
			end = System.currentTimeMillis();
			elapsedTime = (double)(end - start) / 1000; //ms -> s
			System.out.printf("게임 시간: %.2f초", elapsedTime);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
