import java.util.*;
import java.util.Scanner;

public class maximo
{
	public static int maximum(int x, int y, int z)
	{
		int max = x;

		if (y > max)
		{
			max = y;
		}

		if (z > max)
		{
			max = z;
		}

		return max;
	}

	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.print("informe o primeiro valor:");
		num1 = leitura.nextInt();

		System.out.print("informe o segundo valor:");
		num2 = leitura.nextInt();

		System.out.print("informe o terceiro valor:");
		num3 = leitura.nextInt();

		System.out.println("");
		System.out.println("Máximo é: " + maximum(num1,num2,num3));
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