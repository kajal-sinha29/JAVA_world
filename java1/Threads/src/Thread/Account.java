package Thread;

public class Account {
	
	private int balance;
	
	public Account()
	{
		balance = 5000;
	}
	
	public Account(int bal)
	{
		balance = bal;
	}
	public int getBalance()
	{
		return balance;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public String toString()
	{
		return "Balance = "+balance;
	}
	
	class Transaction extends Thread
	{
		Account aob;
		
		
	}

}
