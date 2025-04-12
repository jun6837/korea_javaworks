package classes;


//은행 계좌 클래스 정의
//private - 접근 제어자(내부 클래스만 접근 가능함)
public class BankAccount {
	private String ano; //계좌 번호
	private String owner;//계좌주
	private int balance; //잔고
	
	//기본 생성자
    public BankAccount() {}
    
    //매개변수가 있는 생성자
    public BankAccount(String ano, String owner, int balance) {
    	this.ano = ano;
    	this.owner = owner;
    	this.balance = balance;
    }
    
    //설정자(setter) - set + 멤버이름
    void setAno(String ano) {
    	this.ano =ano;
    }
    
    void setOwner(String owner) {
    	this.owner = owner;}
    
    void setBalance(int balance) {
    	this.balance = balance;}
    	
    
        
    //접근자(getter) - get + 멤버이름
    String getAno() {return ano;}
    String getOwmer() {return owner;}
    int getBalance() {return balance;}
    
    //계좌 정보를 출력하는 메서드
    void displayInfo() {
    	System.out.println("계좌번호 : " + ano);
		System.out.println("계좌주 : " + owner);
		System.out.println("잔고 : " + balance);
    }
}
