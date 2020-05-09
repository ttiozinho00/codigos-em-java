import java.util.*;

public class BarChart
{
	public static void main(String[] args) 
	{
		int array[] = {0,0,0,0,0,0,1,2,4,2,1};
		int count;
		int stars;

		cls();
		System.out.println("Distribuição da Grade:");

		for (count = 0;count < array.length;count++) 
		{
			if (count == 10) 
			{
				System.out.printf("%5d: ",100);
			}

			else
			{
				System.out.printf("%02d-02d: ",count * 10,count * 10+9);	
			}

			for (stars = 0;stars < array[count];stars++) 
			{
				System.out.println("*");
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