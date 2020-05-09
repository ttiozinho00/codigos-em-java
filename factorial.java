import java.math.BigInteger;

public class factorial
{
	public static BigInteger fatorial(BigInteger number)
	{
		if (number.compareTo(BigInteger.ONE) <= 0)
		{
			return BigInteger.ONE;
		}
		else
		{
			return number.multiply(fatorial(number.subtract(BigInteger.ONE)));
		}
	}

	public static void main(String[] args)
	{
		int counter;

		for (counter = 0; counter <= 50; counter++)
		{
			System.out.printf("%d! = %d%n", counter,fatorial(BigInteger.valueOf(counter)));
		}
	}

}