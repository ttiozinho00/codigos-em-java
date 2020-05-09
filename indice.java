import java.util.*;

public class indice
{
	public static void main(String[] args) 
	{
		int i;

		cls();
		
		for (i=0;i <= 10;i++) 
		{
			System.out.println("O valor de i é: " + i);	
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