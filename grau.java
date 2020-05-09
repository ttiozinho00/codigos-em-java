import java.util.Scanner;
import java.util.*;

public class grau
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		double discri;
		int a;
		int b;
		int c;

		cls();
		System.out.print("Informe o primeiro valor: ");	
		a = leitura.nextInt();

		System.out.print("Informe o segundo valor: ");	
		b = leitura.nextInt();

		System.out.print("Informe o terceiro valor: ");	
		c = leitura.nextInt();

		discri = Math.pow(2,b) -4 * a * b;

		System.out.printf("\nO valor da raíz: %f ",discri);

		if (discri > 0)
		{
			System.out.println("");
			System.out.println("\nA equação de segundo grau possui raízes");
		}

		else
		{
			System.out.println("");
			System.out.println("\nA equação de segundo grau não possui raízes");
		}

	}

	public static void cls()
    {
        try
        {

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }

        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}