public class cambalhotas
{
	public static void main(String[] args) 
	{
		cls();
		int cc;

		cc = 1;

		do
		{
			System.out.println(cc);		
			cc++;
		}while(cc <= 4);			
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