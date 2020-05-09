import java.util.*;
import java.util.Scanner;

public class ano {
	public static void main(final String[] args) {
		cls();

	 	int qtd_anos_bi;
		int ano_atual;
		int dias;

		System.out.print("infore o amo atual: ");
		ano_atual = new Scanner(System.in).nextInt();

		qtd_anos_bi = ano_atual / 4;
		dias = (ano_atual - 1) * 365 + qtd_anos_bi;

		System.out.printf("Já se passaram:%d dias desde 01/01/0001\n\n", dias);
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