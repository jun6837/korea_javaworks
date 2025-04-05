package nestedfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 자리배치도 프로그램
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입장객 수 :");
		int customer = sc.nextInt();
		System.out.print("좌석 열 수 :");
		int column = sc.nextInt();
		
		
		int row, rest;
		
		rest = customer % column ;
		
		if(rest == 0) {
			row = customer / column;
			
		}else {
		    row = (int)(customer / column) +1;
		}
		
		System.out.println("=======좌석 배치도======");
		for (int i =0 ; i < row; i++) {
			for (int j=1; j<= column ; j++) {
				if ((i*column+j) > customer)
					break;
				System.out.print("좌석"+(i*column+j) + " ");
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
