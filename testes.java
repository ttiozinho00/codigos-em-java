public class testes
{
	public static void main(String[] args) 
	{
		int a;
		int i;

		cls();

		i = 1;
		a = 0;

		while(i < 10) 
		{
			a++;
			i += 1;

			if( a > 6)
			{
				i++;
			}  
		}	
		System.out.println(i);	
		System.out.println(a);	
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