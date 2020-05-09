public class escrito
{
	public static void main(String[] args) 
	{
		int c;

		c = 1;

		cls();
		do 
		{
			if((c % 5) != 0) 
			{
				System.out.println(c);		
			}

			else
			{
				break;
			}
			c++;

		}while(c <= 10);	
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