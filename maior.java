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

		System.out.println("\nSua idade �: " + idade);

		if(idade >= 18)
		{
			System.out.println("\nJ� tem idade para votar");
			System.out.println("\nJ� tem idade para ter habilita��o");
		}

		else if(idade >= 16)
		{
			System.out.println("\nJ� tem idade npara votar");
		}

		else
		{
			System.out.println("\nN�o pode votar e nem ter habilita��o");
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