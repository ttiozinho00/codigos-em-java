import java.util.Scanner;

public class ambiental
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float indice;

		System.out.print("Digite o indice de poluição: ");
		indice = leitura.nextFloat();

		if(indice >= 0.5)
		{
			System.out.println("\nTodos os grupos devem suspender suas atividades");
		}

		else if(indice >= 0.4)
		{
			System.out.println("\n1º e 2º grupos devem suspender suas atividades");
		}

		else if(indice >= 0.3)
		{
			System.out.println("\nApenas o 1º grupo deve suspender suas atividades");
		}

		else
		{
			System.out.println("\nTodas os grupos podem manter as atividades");
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