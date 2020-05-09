import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class BuscaBinaria
{
	public static int binarySearch(int data[], int key)
	{
		int low = 0;
		int high = data.length - 1;
		int middle = (low + high + 1)/2;
		int location = -1;
		int i;

		do
		{
			System.out.print(remainingElements(data, low, high));

			for (i = 0; i< middle;i++) 
			{
				System.out.print("  ");
				System.out.println("*");				
			}

			if (key == data[middle]) 
			{
				location = middle;
			}

			else if(key < data[middle]) 
			{
				high = middle -1;
			}

			else
			{
				low = middle + 1;
			}
			middle = (low + high +1)/2;	
		}while((low <= high) && (location == -1)); 
		return location;
	}

	private static String remainingElements(int data[], int low, int high)
	{
		StringBuilder temporary = new StringBuilder();
		

		for (int i = 0; i < low; i++)
		{
			temporary.append(" ");
		}

		for (int i = low; i <= high; i++)
		{
			temporary.append(data[i] + " ");
		}
		return String.format("%s%n", temporary);
	}

	public static void main(String[] args)
	{
		cls();

		Scanner leitura = new Scanner(System.in);
		SecureRandom aleatorio = new SecureRandom();

		int data[] = new int[15];
		int searchInt;
		int location;
		int i;

		for (i = 0; i < data.length; i++)
		{
			data[i] = 10 + aleatorio.nextInt(90);
		}

		Arrays.sort(data);
		System.out.printf("%s%n%n",Arrays.toString(data));

		System.out.print("Informe o valor (-1 para sair): ");
		searchInt = leitura.nextInt();

		while (searchInt != -1)
		{
			location = binarySearch(data, searchInt);

			if (location == -1) 
			{
				System.out.printf("\n%d Valor não encontrado!! %n%n", searchInt);
			}

			else
			{
				System.out.printf("\n%d Valor encontrado na posição %d%n%n",searchInt, location);
			}

			System.out.print("Informe o valor (-1 para sair): ");
			searchInt = leitura.nextInt();
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