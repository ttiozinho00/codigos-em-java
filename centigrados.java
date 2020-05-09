import java.util.Scanner;

public class centigrados
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int graus[] = new int[150];
		float c;
		int i;

		for (i = 50;i <= graus.length;i++) 
		{
			c = (i - 32) * 5 / 9;
			System.out.println(i + " F é igual a "+ c +" C");	
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