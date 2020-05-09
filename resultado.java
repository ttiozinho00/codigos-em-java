import java.util.Scanner;

public class resultado
{

	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float result;
		int a;
		int b;	

		System.out.print("Informe o ponto a: ");
		a = leitura.nextInt();

		System.out.print("Informe o ponto b: ");
		b = leitura.nextInt();

		result = (a + b);

		System.out.printf("\nO resultado e de: %.2f\n",reta(result));
	}

	public static float reta(float result)
	{
		result = (result * result) /2;

		return result;
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