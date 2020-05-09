public class printing
{
	public static void main(String[] args) 
	{
		int i;
		int j;

		cls();
		
		for (i = 0;i <= 10 ;i++) 
		{
			for (j = 0;j <= 5;j++) 
			{
				System.out.print('0'); 			
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