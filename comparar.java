import java.util.Scanner;

public class comparar
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int notas;
		int maior_media;
		float media;
		int soma;
		int i;

		media = 0;
		notas = 0;
		soma = 0;

		for(i = 1; i <= 5; i++)
		{
			System.out.print("Digite as 5 notas: ");
			notas = leitura.nextInt();

			soma += notas;
			media = soma/5;
		}
		System.out.println("\nA Soma das notas é: " + soma);
		System.out.println("A média das notas é: " + media);
		System.out.println("\nOs valores maiores que a média são: ");

		for(i = 1; i <= 5; i++)
		{
			if(notas > media)
			{
				maior_media = notas;
				System.out.println(maior_media);
			}
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