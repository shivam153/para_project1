import java.util.HashMap;
public class Gateway_DAO 
{
	static HashMap<Integer, Information> map = new HashMap<>();
	public void addAccount(Information inf)
	{
		map.put(inf.getCustomerID(),inf);
		//System.out.println(map.get(inf.getCustomerID()));
	}
	public Information search(int id)
	{
		//System.out.println("DAO search=" +(Information)map.get(id));
			return (Information)map.get(id);
	}
	public void addBalance(int id,int amt)
	{
		Information inf = map.get(id);
		//stem.out.println(inf.toString());
		inf.setAccountBalance(inf.getAccountBalance()+amt);
		map.put(id,inf);
		System.out.println("New Balance =" +inf.getAccountBalance()+amt);
	}
	public void withdrawBalance(int id,int amt)
	{
		Information inf = map.get(id);
		//stem.out.println(inf.toString());
		inf.setAccountBalance(inf.getAccountBalance()-amt);
		map.put(id,inf);
		inf.getTransaction().add(amt+" withrawl from account");
		System.out.println("New Balance =" +inf.getAccountBalance()+amt);
	}
	public void transfer(int sid,int rid,int amt)
	{
		Information inf = map.get(sid);
		Information inf1= map.get(rid);
		if(inf.getAccountBalance()<amt)
		{
			System.out.println("Insufficient Account Balance");
		}
		else {
			inf.setAccountBalance(inf.getAccountBalance()-amt);
			inf1.setAccountBalance(inf1.getAccountBalance()+amt);
           System.out.println("Transfer successfully executed");
           inf.getTransaction().add(amt+" amount transferred to ID: "+rid);
		}
	}

}
