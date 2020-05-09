public class val 
{
	public static void main(String[] args) 
	{
		cls();

		boolean val1 = 	(4 >= 5);
		boolean val2 = (4 < 4);	
		boolean val3 = (val1 == val2);
		boolean val4 = val1 ^ val3;
		boolean val5 = !val2 && val4; 

		System.out.println(val4 + "\n" + val5);
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