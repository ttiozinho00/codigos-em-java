public class variaveis
{
	public static void main(String[] args) 
	{
		cls();
		char c = 'c';
		int i = 10;
		double d = 20;
		long l = 1;
		String s = "Hello";	

		System.out.println("");
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		System.out.println(l);
		System.out.println(s);
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