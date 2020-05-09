public class continuar
{
	public static void main(String[] args)
	{
		int count;

		cls();
		for (count = 0;count <= 10;count++) 
		{
			if (count == 5) 
			{
				break;				
			}
			System.out.printf("%d\n", count);		
		}
		System.out.println("");
		System.out.printf("Parando o loop com o count: %d\n ", count);	
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