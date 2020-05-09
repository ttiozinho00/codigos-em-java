import  java.util.*;

public class Deposit extends Transaction
{
	private double amount;
	private Keypad keypad;
	private DepositSlot depositSlot;
	private final static int CANCELED = 0;

	public Deposit(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad, DepositSlot atmDepositSlot)
	{
		super(userAccountNumber, atmScreen, atmBankDatabase);

		keypad = atmKeypad;
		depositSlot = atmDepositSlot;			
	}

	@Override
	public void execute()
	{
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();

		amount = promptForDepositAmount();

		if (amount != CANCELED) 
		{
			screen.displayMessage("\nInsere o Envelope com a Quantia Especifica");
			screen.displayDollarAmount(amount);
			screen.displayMessageLine(".");

			boolean envelopeReceived = depositSlot.isEnvelopeReceived();

			if (envelopeReceived) 
			{
				screen.displayMessageLine("\nSeu Envelope " + "received.\nNOTE: O Dinheiro n�o sera Dep�sitado" + "\nIremos Avaliar a Quantia no Envelopo" + "Enclosed cash and your checks clear.");
				bankDatabase.credit(getAccountNumber(), amount);	
			}

			else 
			{
				screen.displayMessageLine("\nVoc� N�o Inseriu o Invelope.!!" + "ATM, Cancelou sua Transa��o");	
			}
		}

		else 
		{
			screen.displayMessageLine("\n Cancelando a Transa��o... ");	
		}
	}

	private double promptForDepositAmount()
	{
		Screen screen = getScreen();

		screen.displayMessage("\nInforme o Valor do Dep�sito em" + "CENTS (0 para sair):");
		int input = keypad.getInput();

		if (input == CANCELED) 
		{
			return CANCELED;
		}

		else 
		{
			return (double)input /100;	
		}
	}
}