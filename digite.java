import java.util.*;
import java.util.Scanner;

public class digite
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		String nome;
		char sexo;

		System.out.print("Informe seu nome: ");
		nome = leitura.nextLine();

		System.out.print("Infor seu sexo: ");
		sexo = leitura.next().charAt(0);

		System.out.println("\nSeu nome é " + nome);
		System.out.println("\nseu sexo é " + sexo);
	}

	public static void cls() 
	{
		try 
		{

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		catch(Exception E) 
		{
			System.out.println(E);
		}
	}
}