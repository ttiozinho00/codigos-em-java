import java.util.*;

public class cubo
{
	public static int cubo(int y)
	{
		return y*y*y;
	}

	public static void main(String[] args) 
	{
		cls();
		int x;

		for (x = 0; x <= 10; x++) 
		{
			System.out.println("" + cubo(x));	
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