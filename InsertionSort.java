import java.security.SecureRandom;
import java.util.Arrays;
import java.util.*;

public class InsertionSort
{
	public static void insertionSort(int[] data)
	{
		for (int next = 1; next < data.length; next++)
		{
			int insert = data[next];
			int moveItem = next;

			while (moveItem > 0 && data[moveItem - 1] > insert)
			{
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			}
			data[moveItem] = insert;
			printPass(data, next, moveItem);
		}
	}

	public static void printPass(int data[], int pass, int index)
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

		for(int i = 0; i <= pass; i++)
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

		insertionSort(data);
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