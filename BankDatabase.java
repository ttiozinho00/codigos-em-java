public class BankDatabase
{
	private Account  accounts[];

	public BankDatabase()
	{
		accounts = new Account[2];
		accounts[0] = new Account(12345, 54321, 1000.0, 1200.0);
		accounts[1] = new Account(98765, 56789, 200.0, 200.0);
	}

	private Account getAccount(int accontNumber)
	{
		for (Account currentAccount : accounts) 
		{
			if (currentAccount.getAccountNumber() == accontNumber) 
			{
				return currentAccount;	
			}	
		}
		return null;
	}

	public boolean authenticateUser(int userAccontNumber, int userPIN)
	{
		Account userAccont = getAccount(userAccontNumber);

		if (userAccont != null) 
		{
			return userAccont.validatePIN(userPIN);
		}

		else
		{
			return false;
		} 
	}

	public double getAvailableBalance(int userAccontNumber)
	{
		return getAccount(userAccontNumber).getAvailableBalance();
	}

	public double getTotalBalance(int userAccontNumber)
	{
		return getAccount(userAccontNumber).getTotalBalance();
	}

	public void credit(int userAccontNumber, double amount)
	{
		getAccount(userAccontNumber).credit(amount);
	}

	public void debit(int userAccontNumber, double amount)
	{
		getAccount(userAccontNumber).debit(amount);
	}
}