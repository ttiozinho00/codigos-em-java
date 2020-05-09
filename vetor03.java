import java.util.Arrays;

public class vetor03
{
	public static void main(String[] args) 
	{
		cls();
		int v[] = {9,2,5,4,1,3};

		Arrays.sort(v);	

		for (int valor : v) 
		{
			System.out.print(valor + "  ");	
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