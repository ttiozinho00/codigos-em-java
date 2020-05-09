import java.util.Scanner;
import java.util.*;

public class calcs
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		String resp;
		int num;
		int s;

		s = 0;

		cls();
		do 
		{
			System.out.print("\nInforme o Valor: ");
			num = leitura.nextInt();

			s += num;

			System.out.print("\nQuer continuar!! [S/N]: ");
			resp = leitura.next(); 
		}while(resp.equals("S"));
		System.out.print("\nA soma dos valores é: " + s);
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