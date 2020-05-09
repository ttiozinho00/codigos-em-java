import java.util.*;

public class bidimensionais
{
	public static void main(String[] args) 
	{
		cls();

		int array1[][] = {{123},{456}};
		int array2[][] = {{12},{3},{456}};

		System.out.println("Valores na array1 por linha são:");
		outputArray(array1);

		System.out.println("\nValores na array2 por linha são:");
		outputArray(array2);	
	}

	public static void outputArray(int array[][])
	{
		for (int row = 0;row < array.length;row++) 
		{
			for (int column = 0; column < array[row].length;column++) 
			{
				System.out.printf(" %d",array[row][column]);			
			}
			System.out.println("");
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