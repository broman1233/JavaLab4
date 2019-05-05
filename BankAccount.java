
public class BankAccount {
	private String accName;
	private int accNum;
	private int pin;
	private double balance;
	
	// Constructors
	public BankAccount() 
	{
		pin = 0;
		accNum = 0;
		accName = "";
		balance = 0;
	}
	
	public BankAccount(int accNum, int pin) 
	{
		this.accNum = accNum;
		this.pin = pin;
		accName = "";
		balance = 0;
	}
	// Setters
	public void setName (String Name)
	{
		accName = Name;
	}
	public void setAccountNumber (int Num)
	{
		if (Num >= 0)
		accNum = Num;
	}
	public void setPIN (int Num)
	{
		if (Num >= 0)
		pin = Num;
	}
	public void setBalance (double Num)
	{
		if (Num >= 0)
		balance = Num;
	}
	//Getters
	public String getName ()
	{
		return accName;
	}
	public int getAccountNumber ()
	{
		return accNum;
	}
	public int getPIN ()
	{
		return pin;
	}
	public double getBalance ()
	{
		return balance;
	}
	//Methods
	
	public void withdrawl(int Num)
	{
		if (Num <= balance && Num > 0)
			balance = balance - Num;
		else
			System.out.println("Insuffeicient Funds");//spell check
	}
	public void deposit(int Num)
	{
		if (Num > 0)
			balance = balance + Num;
		else 
			System.out.println("Error in Deposit");
			
	}
	
	public void transferFunds(int Num, BankAccount toAccount)
	{
		if (Num <= balance)
		{
		this.balance = this.balance - Num;
		toAccount.deposit(Num);
		}
		else
		{
			System.out.println("Insuffeicient Funds");//spell check
		}
			
		 
		
	}
	
	public String toString()
	{
		String Data;
		Data = "id:" + accNum + ", " + "name:" + accName + ", " + "pin:" + pin + ", " + "balance:$" + balance;				
		
		
		return Data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
