public class cambalhota
{
	public static void main(String[] args) 
	{
		cls();
		int cc;

		cc = 0;

		while(cc < 10)
		{
			cc++;

			if (cc == 2 || cc == 3 || cc == 4) 
			{
				continue;
			}

			if (cc == 7) 
			{
				break;
			}
			System.out.println("cambalhota " + cc);	
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