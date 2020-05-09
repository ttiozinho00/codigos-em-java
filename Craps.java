import java.util.Random;
import java.util.*;

public class Craps
{
	private static final Random randomnum = new Random();

	private enum Status{CONTINUE,WON,LOST};

	private static final int SNAKE_EYES = 2; 
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int  BOX_CARS = 12;

	public void play()
	{
		int sumOfDice; 
		int myPoint;
		Status gameStatus;

		myPoint = 0;
		sumOfDice = rollDice();

		switch (sumOfDice) 
		{
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				break;

			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				break;

			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("\nA pontua��o � de: %d\n",myPoint);
				break;					
		}

		while (gameStatus == Status.CONTINUE) 
		{
			sumOfDice = rollDice();

			if (sumOfDice == myPoint) 
			{
				gameStatus = Status.WON;
			}

			else if(sumOfDice == SEVEN)
			{
				gameStatus= Status.LOST;
			}
		}

		if (gameStatus == Status.WON) 
		{

			System.out.println("\nVoc� Ganhou.!!");
		}

		else
		{
			System.out.println("\nVoc� Perdeu.!!");
		}	
	}

	public int rollDice()
	{
		int die1 = 1 + randomnum.nextInt(6);
		int die2 = 1 + randomnum.nextInt(6);
		int sum = die1 + die2;

		System.out.printf("\nJogandor lan�ou: %d + %d = %d",die1,die2,sum);

		return sum;
	}

}