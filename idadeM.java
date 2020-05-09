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

		System.out.print("Digite uma relação de idades: ");

		do
		{
			idade = leitura.nextInt();
			soma += idade;
			cont++;	

		}while(idade > 0);

		media = soma / cont;

		System.out.println("\nA soma das idades é: " + soma);
		System.out.println("A quantidade é: " + cont);
		System.out.println("A média das idades é de: " + media);
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