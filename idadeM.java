import java.util.Scanner;

public class idadeM
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		float media;
		int idade;
		int cont;
		int soma = 1;

		cls();
		cont = -1;

		System.out.print("Digite uma rela��o de idades: ");

		do
		{
			idade = leitura.nextInt();
			soma += idade;
			cont++;	

		}while(idade > 0);

		media = soma / cont;

		System.out.println("\nA soma das idades �: " + soma);
		System.out.println("A quantidade �: " + cont);
		System.out.println("A m�dia das idades � de: " + media);
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