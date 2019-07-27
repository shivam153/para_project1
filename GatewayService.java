import java.util.*;
public class GatewayService 
{
	Scanner sc = new Scanner(System.in);
	public void createAccount(Information inf)
	{
		int accountID = inf.getAccountID();
		int accountNumber = inf.getAccountNumber();
		String name = inf.getCustomerName();
		int age = inf.getCustomerAge();
		int balance = inf.getAccountBalance();
		int custID = inf.getCustomerID();
		Information info = new Information(custID,name,age,accountNumber,accountID,balance);
		Gateway_DAO gt = new Gateway_DAO();
		gt.addAccount(info);
		System.out.println("Service create=" +info.toString());
	}
	public void show(int id)
	{
		Gateway_DAO gt = new Gateway_DAO();
		System.out.println(gt.search(id).toString());
	}
    
	public void deposit(int id,int amt) {
		Gateway_DAO gt = new Gateway_DAO();
		//System.out.println("Service called");
		gt.addBalance(id, amt);
	}
	public void withdraw(int id,int amt) {
		Gateway_DAO gt = new Gateway_DAO();
		//System.out.println("Service called");
		gt.withdrawBalance(id, amt);
	}
	public void transfer(int senderID,int receiverID,int amt)
	{
		Gateway_DAO gt = new Gateway_DAO();
		gt.transfer(senderID,receiverID,amt);
	}
}
