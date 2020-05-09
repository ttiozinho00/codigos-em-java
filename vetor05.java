import java.util.Arrays;

public class vetor05
{
	public static void main(String[] args) 
	{
		cls();

		int num[] = new int[20];

		Arrays.fill(num,9);

		for (int valor : num) 
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