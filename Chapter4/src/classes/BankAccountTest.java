package classes;

public class BankAccountTest {

	public static void main(String[] args) {
		//BankAccout 객체 생성 
	    	
		BankAccount account1 = new BankAccount();
          
		account1.setAno("111-222");
		account1.setOwner("나저축");
		account1.setBalance(10000);
		
//		System.out.println("계좌번호 : " + account1.getAno());
//		System.out.println("계좌주 : " + account1.getOwmer());
//		System.out.println("잔고 : " + account1.getBalance());
		account1.displayInfo();
		
		System.out.println("=======================");
		
		BankAccount account2 = new BankAccount("333-444", "최금리", 20000);
		
		System.out.println("계좌번호 : " + account2.getAno());
		System.out.println("계좌주 : " + account2.getOwmer());
		System.out.println("잔고 : " + account2.getBalance());
		
		
		
		
		
	

	}

}
