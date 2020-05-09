public class idades 
{
	public static void main(String[] args) 
	{
		cls();
		int idades[] = new int[10];
		int i;

		for (i = 0; i < 10; i++) 
		{
			idades[i] = i * 10;	
		}

		for (int x : idades)
		{
			System.out.println(x);
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