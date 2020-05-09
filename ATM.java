import java.util.*;

public class ATM
{
	private boolean userAuthenticated;
	private int currentAccountNumber;
	private Screen screen;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	private DepositSlot depostiSlot;
	private BankDatabase bankDatabase;

	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;

	public ATM()
	{
		userAuthenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		keypad = new Keypad();
		cashDispenser = new CashDispenser();
		depostiSlot = new DepositSlot();
		bankDatabase = new BankDatabase();
	}

	public void run()
	{
		while(true)
		{
			while(!userAuthenticated)
			{
				screen.displayMessageLine("\nBem-Vindo!");
				authenticateUser();
			}

			performTransactions();
			userAuthenticated = false;
			currentAccountNumber = 0;
			screen.displayMessageLine("\nObrigado! Até Logo!");
		}
	}

	private void authenticateUser()
	{
		int accountNumber;
		int pin;

		screen.displayMessageLine("\nPor-Favor informe seu número da conta: ");
		accountNumber = keypad.getInput();

		screen.displayMessageLine("Informe seu PÍN: ");
		pin = keypad.getInput();

		userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);

		if (userAuthenticated) 
		{
			currentAccountNumber = accountNumber;
		}

		else
		{
			screen.displayMessageLine("\nNúmeros da Conta ou do PÍN Inválidos.Por-Favor Tente Novamente.!!");
		}
	}

	private void performTransactions()
	{
		Transaction currentTransaction = null;
		boolean userExited =false;

		while(!userExited)
		{
			int mainMenuSelection = displayMainMenu();

			switch (mainMenuSelection) 
			{
				case BALANCE_INQUIRY:
				case WITHDRAWAL:
				case DEPOSIT:
					currentTransaction = createTransaction(mainMenuSelection);
					currentTransaction.execute();
					break;

				case EXIT:
					screen.displayMessageLine("\nSaindo do Sistema...");
					userExited = true;
					break;

				default:
					screen.displayMessageLine("Você não selecionou a opção.Tente novamente.!!");
					break;	
			}
		}	
	}

	private int displayMainMenu()
	{
		screen.displayMainMenu("\nMenu");
		screen.displayMainMenu("1 - Visualizar o Balanço!!");
		screen.displayMainMenu("2 - Quantidade em Dinheiro!!");
		screen.displayMainMenu("3 - Depósitos na Conta");
		screen.displayMainMenu("4 - Sair");
		screen.displayMainMenu("\nDigite a opção: ");
		return keypad.getInput();
	}

	private Transaction createTransaction(int type)
	{
		Transaction temp = null;

		switch (type) 
		{
			case BALANCE_INQUIRY:
				temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
				break;

			case WITHDRAWAL:
				temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
				break;

			case DEPOSIT:
				temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depostiSlot);
				break;				
		}
		return temp;
	}
}