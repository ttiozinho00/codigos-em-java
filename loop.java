public class loop 
{
	public static void main(String[] args) 
	{
		cls();
		int i;

		for (i = 0; i <= 10000;i++) 
		{
			System.out.println(i);		
		}	
	}

	public static void cls() 
	{
		try 
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		catch (final Exception E) 
		{
			System.out.println(E);
		}
	}
}