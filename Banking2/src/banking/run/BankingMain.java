package banking.run;

import java.util.List;
import java.util.Scanner;

import banking.domain.BankAccount;
import banking.domain.BankAccountDAO;

public class BankingMain {

	static BankAccountDAO accountDAO = new BankAccountDAO();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;
		while(sw) {
			System.out.println("=============================================");
			System.out.println("1.계좌생성 | 2.계좌 목록 | 3.예금  | 4.출금 | 5.종료");
			System.out.println("=============================================");
			System.out.print("선택> ");
			int selelctNum = Integer.parseInt(scan.nextLine());
			
			switch(selelctNum) {
			case 1:
				createAccount();
				break;
			case 2:
				getAccountList();
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
				System.out.println("지원되지 않는 기능입니다. 다시 입력하세요");
				break;
			}
			
		}
		scan.close();

	}
//	계좌 목록
	private static void getAccountList() {
		//accountList 가져오기
		List<BankAccount> accountList= accountDAO.getAccountList();
		for(int i = 0; i < accountList.size() ; i++) {
			BankAccount account = accountList.get(i);
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.println("잔고: " + account.getBalance() );
		}
	}
	//계좌 생성
		private static void createAccount() {
			//계좌 생성
			System.out.println("====================================");
			System.out.println("            계좌 생성                 ");
			System.out.println("====================================");

			while(true) {
				System.out.print("계좌번호: ");
				String ano = scan.nextLine();
				if(accountDAO.findAccount(ano) != null) { //계좌가 이미 등록 되어있다면
					System.out.println("이미 등록된 계좌입니다. 다시 입력해 주세요.");
				}else {
					System.out.print("계좌주: ");
					String owner = scan.nextLine();
					System.out.print("초기 입금액: ");
					int balance = Integer.parseInt(scan.nextLine());
					//신규 계좌 생성
					BankAccount newAccount = new BankAccount(ano, owner, balance);
					accountDAO.createAccount(newAccount);
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}
		}
		// 예금
		private static void deposit() {
			System.out.println("====================================");
			System.out.println("              예 금                  ");
			System.out.println("====================================");
			while(true) {
			System.out.print("계좌번호: ");
			String ano = scan.nextLine();
				
			if (accountDAO.findAccount(ano) != null) { //일치하는 계좌가 있다면
							
				System.out.print("입금액: ");
				int amount = Integer.parseInt(scan.nextLine());
				
				//예금 = 잔고 + 입금액
				accountDAO.deposit(ano, amount);
				BankAccount account = accountDAO.findAccount(ano);
				System.out.println("정상 입금 되었습니다. 현재잔액 : " + account.getBalance() );
				break;
			}else {
				System.out.println("계좌가 없습니다. 다시 입력하세요" );
			}
		 }
		}
		//출금
				private static void withdraw() {
					System.out.println("====================================");
					System.out.println("              출 금                  ");
					System.out.println("====================================");
					System.out.print("계좌번호: ");
					String ano = scan.nextLine();
					
					if (accountDAO.findAccount(ano) != null) { //일치하는 계좌가 있다면
						
						while(true) {
							System.out.print("출금액: ");
							int amount = Integer.parseInt(scan.nextLine());
							//출금 = 잔고 - 입금액
							accountDAO.withdraw(ano, amount);
							BankAccount account = accountDAO.findAccount(ano);
							if(amount > account.getBalance()) {
								System.out.println("잔액이 부족합니다. 다시 입력하세요");

							}else {

								System.out.println("정상 출금 되었습니다. 현재잔액 : " + account.getBalance() );
								break;
							}
						}
					}else {
						System.out.println("계좌가 없습니다." );
					}			
				}
}
