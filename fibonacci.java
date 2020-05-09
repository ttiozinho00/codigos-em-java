import java.util.*;
import java.util.Scanner;

public class fibonacci
{
	public static long fibonacci(long n)
	{
		if ((n==0) | (n==1))
		{	
			return n;
		}

		else
		{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		long result;
		long num;

		System.out.print("informe o valor:");
		num = leitura.nextInt();

		result=fibonacci(num);

		System.out.println("" + num + result);		
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