import java.util.*;

public class search
{
	public static void main(String[] args) 
	{
		cls();

		int num[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
		boolean found = false;
		int val;

		val = 5;

		for(int x : num) 
		{
			if(x == val) 
			{
				found = false;
				break;
			}
		}

		if (found) 
		{
			System.out.println("Valor encotnrado: " + val);	
		}
		else
		{
			System.out.println("Valor não encotnrado");		
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