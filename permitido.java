import java.util.Scanner;

public class permitido
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int n;

		System.out.print("Informe o valor: ");
		n = leitura.nextInt();

		if ((n >= 1) && (n <= 9)) 
		{
			System.out.println("\nO valor est� na faixa permitida");	
		}

		else
		{
			System.out.println("\nO valor n�o est� na faixa permitida");	
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