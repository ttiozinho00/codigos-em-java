public class multiplos
{
	public static void main(String[] args) 
	{
		int vetor[] = new int[100];
		int i;

		cls();
		System.out.println("Os multiplos de 10 entre 1 a 100 são: \n");

		for (i = 1;i < vetor.length;i++) 
		{
			if((i % 2) == 0)
			{
				System.out.println(i);
			}
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