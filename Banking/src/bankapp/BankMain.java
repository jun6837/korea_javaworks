package bankapp;

import java.util.Scanner;

public class BankMain {
	static BankAccount[] accounts = new BankAccount[100];
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean sw = true;
		while(sw) {
			System.out.println("=============================================");
			System.out.println("1.계좌생성 | 2.계좌 목록 | 3.예금  | 4.출금 | 5.종료");
			System.out.println("=============================================");
			System.out.print("선택> ");
			
			try {
				int selectNum = Integer.parseInt(scan.nextLine());
				
				switch(selectNum) {
				case 1:
					createAccount();
					break;
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					sw = false;
					break;
				default:
					System.out.println("다시 입력하세요.");
					break;
			    	}
			}catch(NumberFormatException e) {
				System.out.println("잘못된 입력입니다.");
			}
		}
	scan.close();
	}
	


	private static BankAccount findAccount(String ano) {
		BankAccount account = null; //객체 초기화
		for(int i = 0 ; i< accounts.length ;i++) {
			if(accounts[i] != null) {
				//이미 배열에 저장된 계좌를 가져온다
				String dbAno = accounts[i].getAno();
				if(dbAno.equals(ano)) { // 외부에서 입력한 계좌와 저장된 계좌 비교
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}
	
	private static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println("              출 금                  ");
		System.out.println("====================================");
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		
		if (findAccount(ano) != null) { //일치하는 계좌가 있다면
			BankAccount account = findAccount(ano);
			while(true) {
				System.out.print("출금액: ");
				int amount = Integer.parseInt(scan.nextLine());
				
				if(amount > account.getBalance()) {
					System.out.println("잔액이 부족합니다. 다시 입력하세요");
					
				}else {
					//출금 = 잔고 - 입금액
					account.setBalance(account.getBalance() - amount);
					System.out.println("정상 출금 되었습니다. 현재잔액 : " + account.getBalance() );
					break;
				}
			}
		}else {
			System.out.println("계좌가 없습니다." );
		}
		
	}
	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println("              예 금                  ");
		System.out.println("====================================");
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		System.out.print("입금액: ");
		int amount = Integer.parseInt(scan.nextLine());
		if (findAccount(ano) != null) { //일치하는 계좌가 있다면
			BankAccount account = findAccount(ano);
			//예금 = 잔고 + 입금액
			account.setBalance(account.getBalance() + amount);
			System.out.println("정상 입금 되었습니다. 현재잔액 : " + account.getBalance() );
			
		}else {
			System.out.println("계좌가 없습니다." );
		}
	}
	private static void accountList() {
		// TODO Auto-generated method stub
		for(int i=0 ; i < accounts.length; i++) {
			if(accounts[i] != null) { //배열의 값이 있는 경우에만 출력
			System.out.print("계좌번호 : " + accounts[i].getAno() + "\t");
			System.out.print("계좌주 : " + accounts[i].getOwner() + "\t");
			System.out.print("잔고 : " + accounts[i].getBalance() + "\n");
			}
		}
         
		
	}
	private static void createAccount() {
		// TODO Auto-generated method stub
		//계좌 생성
		System.out.println("====================================");
		System.out.println("            계좌 생성                 ");
		System.out.println("====================================");
		
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		System.out.print("계좌주: ");
		String owner = scan.nextLine();
		System.out.print("초기 입금액: ");
		int balance = Integer.parseInt(scan.nextLine());
		

		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = new BankAccount(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			} 
		}
	}

}
