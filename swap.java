public class swap
{
	public static void swap(Integer i, Integer j) 
	{
		Integer temp = i;
		i = j;
		j = temp;
	}

	public static void main(String[] args) 
	{
		cls();

		Integer i = 10;
		Integer j = 20;
		swap(i,j);
		System.out.println("\ni = "+ i + "\nj = " + j);	
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