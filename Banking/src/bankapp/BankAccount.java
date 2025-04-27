package bankapp;

public class BankAccount {
	private String ano;
	private String owner;
	private int balance;
	
	//생성자
	public BankAccount(String ano, String owner,int balance ) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//설정자 (setter)
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//접근자(getter)
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
}
