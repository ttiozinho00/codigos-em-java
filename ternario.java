public class ternario
{
	public static void main(String[] args) 
	{
		cls();
		int n1;
		int n2;
		int r;

		n1 = 14;
		n2 = 8;

		r = (n1<n2) ? n1+n2 : n1-n2;

		System.out.println(" " + r);	
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