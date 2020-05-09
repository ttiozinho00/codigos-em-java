public class vetor06
{
	public static void main(String[] args) 
	{
		cls();

		int v[] = {2, 0, 3, 9};
		
		v[v[2]] = v[v[1]];
		
		for(int valor : v)
		{
		    System.out.print(valor + " ");
		}
		 System.out.println("");	
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