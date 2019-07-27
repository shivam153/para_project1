import java.util.*;
public class GatewayUI 
{
	public static void main(String args[])
	{
		int ch=-1;
		Random rand = new Random();
		do {
		System.out.println("Enter 1 to create Account\nEnter 2 to deposit\nEnter 3 to withdraw\nEnter 4 to tranfer\nEnter 5 to show balance\nEnter 6 to print transactions\nEnter 0 to terminate");
		Scanner sc = new Scanner(System.in);
		ch = Integer.parseInt(sc.nextLine());
		switch(ch)
		{
		case 1:{
			System.out.println("Enter your name");
			String name = sc.nextLine();
			System.out.println("Enter your age");
			int age = Integer.parseInt(sc.nextLine());
			int accountNumber = rand.nextInt(500);
			int customerID = rand.nextInt(1000);
			int accountID = rand.nextInt(2000);
			int accountBalance = 0;
			//Customer cust = new Customer(customerID,name,age,accountNumber);
			//Account acc = new Account(accountID,accountNumber,name,accountBalance);
			Information inf = new Information(customerID,name,age,accountNumber,accountID,accountBalance);
			System.out.println("Account Created with Account Number:" + accountNumber + " And customer ID: "+customerID);
			GatewayService serv = new GatewayService();
			serv.createAccount(inf);
			//System.out.println(acc+ " " +cust);
			break;
		}
		case 2:{
			System.out.println("Enter Customer ID to deposit");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter amount to deposit");
			int amt = Integer.parseInt(sc.nextLine());
			GatewayService serv = new GatewayService();
			serv.deposit(id,amt);
			break;
		}
		case 3:{
			System.out.println("Enter Customer ID to withdraw");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter amount to withdraw");
			int amt = Integer.parseInt(sc.nextLine());
			GatewayService serv = new GatewayService();
			serv.withdraw(id,amt);
			break;
		}
		case 4:{
			System.out.println("Enter your ID");
			int id = Integer.parseInt(sc.nextLine());
			GatewayService serv = new GatewayService();
			System.out.println("Enter the ID you want to tranfer the amount");
			int idT = Integer.parseInt(sc.nextLine());
			System.out.println("Enter amount to transfer");
			int amt = Integer.parseInt(sc.nextLine());
			serv.transfer(id,idT,amt);
			break;
		}
		case 5:{
			System.out.println("Enter Customer ID to display details");
			int id = sc.nextInt();
			GatewayService serv = new GatewayService();
			serv.show(id);
			break;
		}
		case 0:{
			System.exit(0);
			break;
		}
		
		}
	}while(ch!=0);

}
}
