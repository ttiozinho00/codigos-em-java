public class calc
{
	public static void main(String[] args) 
	{
		cls();

		int v1;
		int v2;
		int v3;

		v1 = 7;
		v2 = v1 % 2;
		v3 = 2;

		v3 += v2;

		System.out.println(v1 + " " + v2 + " " + v3);
		
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