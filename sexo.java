import java.util.*;

public class sexo
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);
		String nome;
		char sexo;	

		System.out.print("Informe o seu nome: ");
		nome = leitura.nextLine();

		System.out.print("Informe o seu sexo: ");
		sexo = leitura.next().charAt(0);
		
		if((sexo == 'M') || (sexo == 'm'))
		{
			System.out.println("\nIlmo Sr. " + nome);
		}

		else if((sexo == 'F') || (sexo == 'f'))
		{
			System.out.println("\nIlmo Sra. " + nome);	
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