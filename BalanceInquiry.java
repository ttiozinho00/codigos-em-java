import java.util.*;

public class BalanceInquiry extends Transaction
{
	public BalanceInquiry(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase)
	{
		super(userAccountNumber, atmScreen, atmBankDatabase);
	}

	@Override
	public void execute()
	{
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber()); 
		double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

		screen.displayMessageLine("\nInformação do Balanaço: ");
		screen.displayMessage("- Avaliando o Balnço: ");
		screen.displayDollarAmount(availableBalance);
		screen.displayMessage("\n- Total do Balanaço: ");
		screen.displayDollarAmount(totalBalance);
		screen.displayMessageLine("");	
	}
}