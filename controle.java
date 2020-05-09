public class controle
{
	public static void main(String[] args) 
	{
		int count;

		count = 0;

		cls();

		while (count <= 10) 
		{
			System.out.println("" + count);
			count ++;		
		}

		System.out.println("");	
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