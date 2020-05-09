import java.util.Scanner;

public class peso
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float a;
		float p;
		char s;

		System.out.print("Digite o seu sexo F ou M: ");
		s = leitura.next().charAt(0);

		System.out.print("Digite a sua altura: ");
		a = leitura.nextFloat();

		System.out.print("Digite a seu peso: ");
		p = leitura.nextFloat();

		if(s == 'F' || s == 'f')
		{
			p = (float)((float)(62.1 * a) - 44.7);
			System.out.println("\nSeu peso ideal é: " + p);
		}

		else if(s == 'M' || s == 'm')
		{
			p = (float)(72.7 * a) - 58;
			System.out.println("\nSeu peso ideal é: " + p);	
		}

		else
		{
			System.out.println("\nDigite um sexo válido");	
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