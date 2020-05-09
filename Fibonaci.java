import java.math.BigInteger;
import java.util.*;

public class Fibonaci
{
	private static BigInteger TWO = BigInteger.valueOf(2);

	public static BigInteger fibonacci(BigInteger number)
	{
		if (number.equals(BigInteger.ZERO) || number.equals(BigInteger.ONE))
		{
			return number;
		}

		else
		{
			return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
		}
	}

	public static void main(String[] args)
	{
		cls();
		int counter;

		for (counter = 0; counter <= 40; counter++)
		{
			System.out.printf("Fibonacci de %d é: %d%n",counter,fibonacci(BigInteger.valueOf(counter)));
		}		
	}

	public static void cls()
    	{
        	try
        	{
        		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        	}

        	catch(Exception E)
        	{
           		System.out.println(E);
        	}
   	}	
	
}