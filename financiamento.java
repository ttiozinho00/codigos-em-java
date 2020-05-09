import java.util.Scanner;

public class financiamento
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float financ;
		float sala;

		System.out.print("Digite o valor do salário: ");
		sala = leitura.nextFloat();

		System.out.print("Digite o valor do financiamento pretendido: ");
		financ = leitura.nextFloat();

		if(financ <= 5 * sala)
		{
			System.out.println("\nFinanciamento concedido, obrigado por nos consultar");
		}

		else
		{
			System.out.println("\nFinanciamento negado, obrigado por nos consultar");	
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