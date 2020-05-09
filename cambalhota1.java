public class cambalhota1
{
	public static void main(String[] args) 
	{
		int cc;

		cls();
		
		for (cc = 0;cc <= 10 ;cc++) 
		{
			if (cc == 2 || cc == 4 || cc == 6) 
			{
				continue;
			}

			else if(cc == 7)
			{
				break;
			}
			System.out.println(cc);
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