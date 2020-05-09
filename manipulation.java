import java.util.Arrays;
import java.util.*;

public class manipulation
{

	public static void main(String[] args) 
	{
		cls();

		double doubleArray[] = {8.4,9.3,0.2,7.9,3.4};

		Arrays.sort(doubleArray);
		System.out.printf("\ndoubleArray: ");

		for (double value : doubleArray) 
		{
			System.out.printf("%.1f",value);		
		}

		int filledIntArray[] = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray,"filledIntArray");

		int intArray[] = {1,2,3,4,5,6};
		int intArrayCopy[] = new int[intArray.length];
		System.arraycopy(intArray, 0,intArrayCopy,0,intArray.length);
		displayArray(intArray,"intArray");
		displayArray(intArrayCopy,"intArrayCopy");

		boolean b = Arrays.equals(intArray,filledIntArray);
		System.out.printf("\n\nintArray %s filledIntArray\n",(b ? "==":"!="));

		int location = Arrays.binarySearch(intArray, 5);

		if (location >= 0) 
		{
			System.out.printf("Encontramos 5 elementos %d na intArray\n",location);			
		}

		else
		{
			System.out.println("\nNão encontramos os elementos na intArray");	
		}

		location = Arrays.binarySearch(intArray,8763);

		if (location >= 0) 
		{
			System.out.printf("Encontramos 8763 elementos %d na intArray\n",location);			
		}

		else
		{
			System.out.println("\nNão encontramos os elementos na intArray");	
		}		
	}

	public static void displayArray(int array[], String description)
	{
		System.out.printf("\n%s: ",description);

		for (int value : array) 
		{
			System.out.printf("%d",value);					
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
