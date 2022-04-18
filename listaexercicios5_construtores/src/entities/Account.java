package entities;

public class Account {

	private int accountNumber;
	private String accountName;
	private double accountAmount;

	public Account(int accountNumber, String accountName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		addValue(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public double getAccountAmount() {
		return accountAmount;
	}

	public void addname (String accountName) {
		this.accountName = accountName;
	}
	
	public void addValue(double accountAmount) {
		this.accountAmount += accountAmount;
	}
	
	public void removeValue(double accountAmount) {
		this.accountAmount -= accountAmount + 5.0;
	}
	
	public String toString() {									// toString é a função que retorna um concatenado quando chamamos 
		return "Account "										// a classe em Program
				+ accountNumber									// ex: System.out.println(account); 
				+ ", Holder: "									// sendo que a account é a instanciação do objeto em Program
				+ accountName
				+ ", Balance: "
				+ String.format("$ %.2f", accountAmount);
	}
	
	
}
