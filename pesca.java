import java.util.Scanner;

public class pesca
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float pesopermitido;
		float excesso;
		float multa;
		float peso;

		System.out.print("Digite o peso permtido: ");
		pesopermitido = leitura.nextFloat();

		System.out.print("Digite o peso da pesca: ");
		peso = leitura.nextFloat();

		if(pesopermitido < peso)
		{
			excesso = peso - pesopermitido;
			multa = excesso * 4;

			System.out.println("\nHouve excesso de: " + excesso + " Kg, com multa de: " + multa);
		}

		else
		{
			System.out.println("\nO pescador não vai pagar nada");
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