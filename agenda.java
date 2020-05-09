import java.util.Arrays;

public class agenda
{
	public static void main(String[] args) 
	{
		cls();
		String entry[][] = new String[][] {{"\nName: Florence", "Tel. #: 735-1234", "Address: Manila"},{"\nName: Joyce", "Tel. #: 983-3333", "Address: Quezon City"},{"\nName: Becca", "Tel. #: 456-3322", "Address: Manila"}};

		//System.out.println(Arrays.deepToString(entry));		

		Arrays.stream(entry).flatMap(x -> Arrays.stream(x)).forEach(System.out::println);
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