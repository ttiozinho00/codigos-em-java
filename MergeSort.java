import  java.security.SecureRandom;
import java.util.Arrays;
import java.util.*;

public class MergeSort
{
	public static void mergeSort(int data[])
	{
		sortArray(data, 0, data.length - 1);
	}

	private static void sortArray(int data[], int low, int high)
	{
		int middle1;
		int middle2;

		if ((high - low) >= 1)
		{
			middle1 = (low + high) / 2;
			middle2 = middle1 + 1;

			System.out.printf("split: %s%n",subarrayString(data, low, high));
			System.out.printf(" %s%n",subarrayString(data, low, middle1));
			System.out.printf(" %s%n%n",subarrayString(data, middle2, high));

			sortArray(data, low, middle1);
			sortArray(data, middle2, high);
			merge (data, low, middle1, middle2, high);
		}
	}

	private static void merge(int data[], int left, int middle1,int middle2, int right)
	{
		int leftIndex = left;
		int rightIndex = middle2;
		int combinedIndex = left;
		int combined[] = new int[data.length];

		System.out.printf("merge: %s%n",subarrayString(data, left, middle1));
		System.out.printf(" %s%n",subarrayString(data, middle2, right));

		while (leftIndex <= middle1 && rightIndex <= right)
		{
			if (data[leftIndex] <= data[rightIndex])
			{
				combined[combinedIndex++] = data[leftIndex++];
			}

			else
			{
				combined[combinedIndex++] = data[rightIndex++];
			}
		}

		if (leftIndex == middle2)
		{
			while (rightIndex <= right)
			{
				combined[combinedIndex++] = data[rightIndex++];
			}
		}

		else
		{
			while (leftIndex <= middle1)
			{
				combined[combinedIndex++] = data[leftIndex++];
			}
		}

		for (int i = left; i <= right; i++)
		{
			data[i] = combined[i];
		}
		System.out.printf(" %s%n%n",subarrayString(data, left, right));
	}

	private static String subarrayString(int data[], int low, int high)
	{
		StringBuilder temporario = new StringBuilder();

		for (int i = 0; i < low; i++)
		{
			temporario.append(" ");
		}

		for (int i = low; i <= high; i++)
		{
			temporario.append(" " + data[i]);
		}

		return temporario.toString();
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
		mergeSort(data);

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