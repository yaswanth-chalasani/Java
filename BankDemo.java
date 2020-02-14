package programs;
class InsufficientFundsException extends Exception
{
	private double amount;
	public InsufficientFundsException(double amount)
	{
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}
}
class CheckingAccount
{
	private double balance;
	private int number;
	public CheckingAccount(int number)
	{
		this.number=number;
	}
	public void deposit(double amount)
	{
		balance +=amount;
	}
	public void withdraw(double amount)throws InsufficientFundsException
	{
		if(amount<=balance)
		{
			balance-=amount;
		}
		else
		{
			double needs=amount-balance;
			throw new InsufficientFundsException(needs);
		}
	}
	public double getBalance()
	{
		return balance;
	}
	public int getNumber()
	{
		return number;
	}
}
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount c=new CheckingAccount(101);
		System.out.println("Depositing $500");
		c.deposit(500.00);
		try
		{
			System.out.println("\n withdrawing $500");
			c.withdraw(100.00);
			System.out.println("\n withdrawing $500");
			c.withdraw(600.00);			
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("Sorry,but you are shot $"+e.getAmount());
			e.printStackTrace();	
		}
	}

}
