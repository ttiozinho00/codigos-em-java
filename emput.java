import java.util.*;

public class emput
{
	public static void main(String[] args) 
	{
		cls();
		String nome = "Douglas";	
		impnome("Empty");
	}

	public static void impnome(String nome)
	{
		if (!nome.isEmpty()) 
		{
			System.out.println("Tudo Bem " + nome + " ?");
		}

		else
		{
			System.out.println("O nome é " + nome + " ?");	
		}
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