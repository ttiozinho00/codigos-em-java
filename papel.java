import java.util.*;

public class papel
{
	public static void main(String[] args) 
	{
		cls();
		int cont;

		for (cont = 0;cont <= 1000;cont++) 
		{
			System.out.println("Não vou jogar papel na aula");		
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