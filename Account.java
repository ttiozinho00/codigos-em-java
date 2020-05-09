public class Account
{
	private int accontNumber;
	private int pin;
	private double availableBalance;
	private double totalBalance;

	public Account(int theAccontNumber, int thePIN, double theAvailableBalance, double theTotalBalance)
	{
		accontNumber = theAccontNumber;
		pin = thePIN;
		availableBalance = theAvailableBalance;
		totalBalance = theTotalBalance;
	}

	public boolean validatePIN(int userPIN)
	{
		if (userPIN == pin) 
		{
			return true;
		}

		else
		{
			return false;
		}
	}

	public double getAvailableBalance()
	{
		return availableBalance;
	}

	public double getTotalBalance()
	{
		return totalBalance;
	}

	public void credit(double amount)
	{
		totalBalance += amount;
	}

	public void debit(double amount)
	{
		availableBalance -= amount;
		totalBalance -= amount;
	}

	public int getAccountNumber()
	{
		return accontNumber;
	}
}