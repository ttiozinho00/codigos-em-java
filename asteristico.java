public class asteristico
{
	public static void main(String[] args) 
	{
		int count;
		count = 1;

		cls();
		
		while(count <= 10)
		{
			System.out.println(count %2 == 1 ? "****" : "++++++++++++++");
			++count;
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