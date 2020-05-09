import java.util.*;

public class Withdrawal extends Transaction
{
	private int amount;
	private Keypad keypad;
	private CashDispenser cashDispenser;

	private final static int CANCELED = 6; 

	public Withdrawal(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad, CashDispenser atmCashDispenser)
	{
		super(userAccountNumber, atmScreen, atmBankDatabase);

		keypad = atmKeypad;
		cashDispenser = atmCashDispenser;
	} 	

	@Override
	public void execute()
	{
		boolean cashDispensed = false;
		double availableBalance;

		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();

		do
		{
			amount = displayMenuOfAmounts();

			if (amount != CANCELED) 
			{
				availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

				if (amount <= availableBalance) 
				{
					if(cashDispenser.isSufficientCashAvailLable(amount)) 
					{
						bankDatabase.debit(getAccountNumber(),amount);
						cashDispenser.dispenseCash(amount);
						cashDispensed = true;

						screen.displayMessageLine("\nSeu dinheiro está disponivel" + "Por-Favor retire o dinheiro.");
					}

					else
					{
						screen.displayMessageLine("\nDinheiro insuficiente verificando na ATM." + "\n\nDesculpe Estamos sem Dinheiro.");		
					}
				}

				else
				{
					screen.displayMessageLine("\nSaldo Insuficiente na Conta" + "\n\nVerifique o Saldo na Conta");
				}	
			}

			else
			{
				screen.displayMessageLine("\nCancelando a Transação");
				return;
			}
		}while(!cashDispensed);
	}

	private int displayMenuOfAmounts()
	{
		int userChoice = 0;
		int input;
		Screen screen = getScreen();

		int amounts[] = {0,20,40,60,100,200,500};

		while(userChoice == 0) 
		{
			screen.displayMessageLine("\nMenu");
			screen.displayMessageLine("1 - $20");
			screen.displayMessageLine("2 - $40");
			screen.displayMessageLine("3 - $60");
			screen.displayMessageLine("4 - $100");
			screen.displayMessageLine("5 - $200");
			screen.displayMessageLine("6 - $500");
			screen.displayMessageLine("7 - Cancelar a Transação");

			input = keypad.getInput();

			switch (input) 
			{
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					userChoice = amounts[input];
					break;

				case CANCELED:
					userChoice = CANCELED;
					break;

				default:
					screen.displayMessageLine("\nOpção Invalida. Tente Novamente");	
			}
		}
		return userChoice;
	}
}