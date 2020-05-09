import java.util.Scanner;

public class manipulando
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float maior;
		float menor;
		float meio;
		float a;
		float b;
		float c;
		int x;

		maior = 0;
		menor = 0;
		meio = 0; 

		System.out.print("Digite o valor de A: ");
		a = leitura.nextFloat(); 

		System.out.print("Digite o valor de B: ");
		b = leitura.nextFloat(); 

		System.out.print("Digite o valor de C: ");
		c = leitura.nextFloat();

		if((a > b) & (b > c))
		{
			maior = a;
			meio = b;
			menor = c;
		}

		else if((a > c) & (c > b))
		{
			maior = a;
			meio = c;
			menor = b;
		}

		else if((b > a) & (a > c))
		{
			maior = b;
			meio = a;
			menor = c;
		}

		else if((b > c) & (c > a))
		{
			maior = b;
			meio = c;
			menor = a;
		} 

		else if((c > a) & (a > b))
		{
			maior = c;
			meio = a;
			menor = b;
		} 

		else if((c > b) & (b > a))
		{
			maior = c;
			meio = b;
			menor = a;				
		}

		System.out.print("\nDigite o valor de X: ");
		x = leitura.nextInt();

		switch(x)
		{
			case 1:
				System.out.println(menor + meio + maior);
				break;

			case 2:
				System.out.println(maior + meio + menor);
				break;

			case 3:
				System.out.println(menor + maior + meio);
				break;

			default:
				System.out.println("\nNão é nem 1, 2 ou 3");					
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