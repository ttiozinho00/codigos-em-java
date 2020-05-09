import java.util.*;

public class quadrado
{
	public static int square(int y)
	{
		return y * y;
	}

	public static void main(String[] args) 
	{
		cls();

		int x;

		for (x = 0;x <= 10; x++) 
		{
			System.out.println("");
			System.out.print("" + square(x));	
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