import java.util.*;

public class bubble
{
	public static void main(String[] args) 
	{
		cls();
		
		int num[] = {99, -10, 100123, 18, -978,5623, 463, -9, 287, 49};
		int size;
		int a;
		int b; 
		int t;
		int i;

		size = 10;

		System.out.println("");	
		System.out.print("Array original é:");

		for(i=0; i < size; i++)
		{
			System.out.print(" " + num[i]);
		}
		System.out.println("");

		for (a=1; a < size; a++) 
		{
			for (b=size-1; b >= a; b--) 
			{
				if(num[b-1] > num[b])
				{
					t = num[b-1];
					num[b-1] = num[b];
					num[b] = t;
				}		
			}
			System.out.print("Array ordenado é:");

			for(i=0; i < size; i++)
			{
				System.out.print(" " + num[i]);
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