public class continuar
{
	public static void main(String[] args)
	{
		int count;

		cls();
		for (count = 1;count <= 10;count++) 
		{
			if (count == 5) 
			{
				continue;				
			}
			System.out.printf("%d\n", count);		
		}
		System.out.println("");
		System.out.printf("continuando o loop apartir do número: %d\n ", count);	
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