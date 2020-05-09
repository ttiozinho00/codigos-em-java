public class chamada
{
	public static int f1(int n)
	{
		return n%2;
	}

	public static int f2(int n)
	{
		return n*2;
	}

	public static int f3(int a, int b)
	{
		return a + b;
	}

	public static void main(String[] args) 
	{
		cls();

		System.out.println(f3(f1(3), f2(5)));		
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