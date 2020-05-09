import java.util.*;
import java.util.Random;

public class scala
{
	public static void main(String[] args) 
	{
		cls();
		Random gerador = new Random();

		int i;

		for (i = 0; i <= 20; i++) 
		{
			System.out.println("");		
			System.out.print("" + 1 +(gerador.nextInt()%20));
		}
		
		if ((i%5)==0) 
		{
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