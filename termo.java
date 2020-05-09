import java.util.*;

public class termo
{
	public static void main(String[] args) 
	{
		int termo;
		int a;
		int i;
		int q;

		for (i = 5; i > 0;i++) 
		{
			a = i;
			q = 3;
			termo = a;
			
			while(termo<=9*a)
			{
				termo=termo*q;
				System.out.print("" + termo);
			}
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