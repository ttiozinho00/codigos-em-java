import java.util.*;

public class some
{
	public static String someMethod(int[] array2, int x)
	{
		if (x < array2.length)
		{
			return String.format("%s%d ", someMethod(array2, x + 1), array2[x]);
		}
		else
		{
			return "";
		}		
	}

	public static void main(String[] args)
	{
		cls();

		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String results = someMethod(array, 0);
		System.out.println(results);	
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