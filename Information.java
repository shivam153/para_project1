import java.util.List;

public class Information 
{
	private int customerID;
	private String customerName;
	private int customerAge;
	private int accountNumber;
	private int accountID;
	private int accountBalance;
	private List<String> transaction;
	
	public Information(int customerID, String customerName, int customerAge, int accountNumber, int accountID, int accountBalance) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.accountNumber = accountNumber;
		this.accountID = accountID;
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Information [customerID=" + customerID + ", customerName=" + customerName + ", customerAge="
				+ customerAge + ", accountNumber=" + accountNumber + ", accountID=" + accountID + ", accountBalance="
				+ accountBalance + "]";
	}
	public Information() {
		super();
	}
	public List<String> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<String> transaction) {
		this.transaction = transaction;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
