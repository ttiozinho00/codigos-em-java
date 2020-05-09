import java.security.SecureRandom;
import java.util.Arrays;
import java.util.*;

public class SelectionSort
{
	public static void selectionSort(int data[])
	{
		int smallest;
		int index;
		int i;

		for(i = 0; i < data.length - 1; i++)
		{
			smallest = i;

			for(index = i + 1; index < data.length; index++)
			{
				if (data[index] < data[smallest]) 
				{
					smallest = index;
				}
			}
			swap(data, i, smallest);
			printPass(data,i + 1, smallest);	
		}
	}

	private static void swap(int data[], int first, int second)
	{
		int temporary = data[first];
		data[first] = data[second];
		data[second] = temporary;
	}

	private static void printPass(int data[], int pass, int index)
	{
		System.out.printf("proxima transição %2d: ", pass);

		for (int i = 0; i < index; i++)
		{
			System.out.printf("%d ", data[i]);
		}
		System.out.printf("%d* ", data[index]);

		for (int i = index + 1; i < data.length; i++)
		{
			System.out.printf("%d ", data[i]);
		}
		System.out.printf("%n ");

		for (int j = 0; j < pass; j++)
		{
			System.out.print("-- ");	
		}
		System.out.println("");
	}

	public static void main(String[] args) 
	{
		cls();

		SecureRandom aleatorio = new SecureRandom();

		int data[] = new int[10];
		int i;

		for (i = 0; i < data.length; i++)
		{
			data[i] = 10 + aleatorio.nextInt(90);
		}

		System.out.printf("Array aleatória: %n%s%n%n",Arrays.toString(data));
		selectionSort(data);

		System.out.printf("\nArray selecionada: %n%s%n%n",Arrays.toString(data));
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