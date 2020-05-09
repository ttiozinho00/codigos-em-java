import java.util.*;

public class passarray
{
	public static void main(String[] args) 
	{
		cls();

		int array[] = {1,2,3,4,5};

		System.out.println("Passnado o efeito do array individual:\n" + "O valor da array original são:");	

		for (int valor : array) 
		{
			System.out.printf(" %d",valor);
		}
		modifyArray(array);
		System.out.printf("\n\n Valores modificados são: ");

		for (int valor : array) 
		{
			System.out.printf(" %d",valor);
		}
		modifyElement(array[3]);
		System.out.printf("array[3] depois do modifyElement: %d\n",array[3]);
	}

	public static void modifyArray(int array2[])
	{
		for (int count = 0;count < array2.length;count++) 
		{
			array2[count] *= 2;
		}
	}

	public static void modifyElement(int element)
	{
		element *= 2;
		System.out.printf("\nValor dos elementos modificados: %d\n",element);
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