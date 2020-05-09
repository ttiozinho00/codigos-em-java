import java.util.Random;

public class aleatorio
{
	public static void main(String[] args) 
	{
		Random randomnum = new Random();
		int count;
		int face;

		cls();
		for (count = 1;count <= 20;count++) 
		{
			face = 1 + randomnum.nextInt(6);

			System.out.printf("%d ", face);

			if ((count%5)==0) 
			{
				System.out.println("");	
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