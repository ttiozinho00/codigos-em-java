import java.util.Scanner;

public class maior
{
	public static void main(String[] args) 
	{	
		Scanner leitura = new Scanner(System.in);
		cls();

		int idade;
		int ano;

		System.out.print("digite seu ano de nascimento: ");
		ano = leitura.nextInt();

		idade = 2020 - ano;

		System.out.println("\nSua idade é: " + idade);

		if(idade >= 18)
		{
			System.out.println("\nJá tem idade para votar");
			System.out.println("\nJá tem idade para ter habilitação");
		}

		else if(idade >= 16)
		{
			System.out.println("\nJá tem idade npara votar");
		}

		else
		{
			System.out.println("\nNão pode votar e nem ter habilitação");
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