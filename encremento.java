public class encremento
{
	public static void main(String[] args) 
	{
		cls();
		int n;

		n = 4;

		System.out.println(" " + n++);	
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