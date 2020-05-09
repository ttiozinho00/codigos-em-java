import java.util.Scanner;

public class baskara
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

        float delta;
		float x1;
		float x2;
		float a;
		float b;
		float c;

		System.out.print("Informe o primeiro valor: ");
		a = leitura.nextFloat();

		System.out.print("Informe o primeiro valor: ");
		b = leitura.nextFloat();

		System.out.print("Informe o primeiro valor: ");
		c = leitura.nextFloat();

		delta = (float) ((float) b * b - 4.0 * a * c);

		if (delta >= 0.0) 
		{
	        x1 = (float) (( -b + Math.sqrt(delta))/(2.0 * a));
	        x2 = (float) (( -b - Math.sqrt(delta))/(2.0 * a));

	        System.out.println("\nAs raízes do polinômio de coeficientes " + a + b + c + " São " + x1 + x2);
		}

		else
		{
	        System.out.println("\ndelta negativo. Não ha raízes reais");	
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