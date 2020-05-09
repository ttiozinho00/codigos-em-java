import java.util.*;

public class segundo
{
	public static void main(String[] args) 
	{
		cls();

		int a = 5;
		a = 5+10;

		System.out.println("O valor é: " + a);	
	}

	public static void cls() 
	{
		try 
		{

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		catch (final Exception E) 
		{
			System.out.println(E);
		}
	}
} 