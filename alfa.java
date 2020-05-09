public class alfa
{
	public static void main(String[] args) 
	{
		char ch;
		String test2 = "abcde";
		String test = new String("abcde");

		cls();

		if(test.equals(test2)) 
		{
			ch = (test == test2) ? test.charAt(0) : test.charAt(1);	
		}

		else 
		{
			ch = (test == test2) ? test.charAt(2) : test.charAt(3);			
		}
		System.out.println(ch);	
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