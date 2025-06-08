package banking.domain;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BankAccountDAO {
	
	static {
		try {
			//클래스 로딩시 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static String url = "jdbc:oracle:thin:@localhost:1521/xe"; //db url
	static String username = "javauser"; //user 계정
	static String password = "pwjava";
	
	//계좌 생성
	public void createAccount(BankAccount account) {
		String sql = "INSERT INTO bank_account VALUES (?,?,?)";
		try(Connection conn = DriverManager.getConnection(url, username	, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setString(1, account.getAno());
				pstmt.setString(2, account.getOwner());
				pstmt.setInt(3, account.getBalance());
				pstmt.execute();
				
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//계좌 목록 보기
	public List<BankAccount> getAccountList(){
		String sql = "SELECT * FROM bank_account";
		List<BankAccount> accountList = new ArrayList<>();
		try(Connection conn = DriverManager.getConnection(url, username	, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owener = rs.getString("owner");
				int	balance = rs.getInt("balance");
				//새 계좌 생성
				BankAccount account = new BankAccount(ano, owener, balance);
				accountList.add(account);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return accountList;
	}
	//계좌 검색(계좌 상세보기)
	public BankAccount findAccount(String ano) {
		String sql = "SELECT * FROM bank_account WHERE ano =?";
		BankAccount account = null;
		try(Connection conn = DriverManager.getConnection(url, username	, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, ano);
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					ano = rs.getString("ano");
					String owner = rs.getString("owner");
					int balance = rs.getInt("balance");

					account = new BankAccount(ano, owner, balance);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return account;
	}
	//예금
	public void deposit(String ano, int money) { // 계좌번호, 입금액

		BankAccount account = findAccount(ano);
		String owner = account.getOwner();
		int balance = account.getBalance() + money;
		String sql = "UPDATE bank_account SET owner = ?, balance = ? "
				+ "WHERE ano = ?";
		try(Connection conn = DriverManager.getConnection(url, username	, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			pstmt.execute();
		}		catch(SQLException e) {
			e.printStackTrace();
		}	
	
	}
	//출금
	public void withdraw(String ano, int money) { // 계좌번호, 입금액

		BankAccount account = findAccount(ano);
		String owner = account.getOwner();
		int balance = account.getBalance() - money;
		String sql = "UPDATE bank_account SET owner = ?, balance = ? "
				+ "WHERE ano = ?";
		try(Connection conn = DriverManager.getConnection(url, username	, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			pstmt.execute();
		}		catch(SQLException e) {
			e.printStackTrace();
		}	
	
	}
	
}
