import java.util.Scanner;

public class armazenamento
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int a;
		int b;
		int num;

		System.out.print("Informe o valor: ");
		num = leitura.nextInt();

		if(num >= 0 && num <=11)
		{
			a = num;
			System.out.println("\nO numero: " + a + " está na variável A");
		}

		else
		{
			b = num;
			System.out.println("\nO numero: " + b + " está na variável B");
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