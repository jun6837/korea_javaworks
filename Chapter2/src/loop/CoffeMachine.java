package loop;

import java.util.Scanner;

public class CoffeMachine {

	public static void main(String[] args) {
		// 커피 자동 판매기
		int coffee = 5;
		Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.print("돈을 넣어주세요: ");
        	int money = sc.nextInt();
        	if(money == 500) {
        		System.out.println("커피가 나옵니다.");
        		coffee -=1; 
        	  	}
        	else if(money >500) {
        		System.out.println("거스름돈 "+ (money - 500)+"원을 돌려주고 커피가 나옵니다.");
        		coffee = coffee - 1;
        	}
        	else {
        		System.out.println("돈을 돌려주고 커피는 나오지 않습니다.");
        	}
        	System.out.println("남은 커피의 양은 "+coffee+"개입니다.");
        	if(coffee == 0) {
        		System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
        		break;
        	}
        }
	
        sc.close();
        
	}

}
 