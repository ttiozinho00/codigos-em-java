public class vetor07
{
	public static void main(String[] args) 
	{
		cls();

		String s = "CURSOEMVIDEO";
		char r[] = new char[13];

		for (int c = s.length() - 1;c >= 0;c--) 
		{
			r[c] = s.charAt(c);		
		}

		for (char l : r) 
		{	
			System.out.print(l);	
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