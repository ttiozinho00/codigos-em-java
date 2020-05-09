public class parte 
{
	public static void main(String[] args) 
	{
		cls();	

		String parte1 = "Douglas";
		String parte2 = "Barreto";
		String parte3 = parte1 + parte2;
		String parte4 = "DouglasBarreto";

		System.out.println(parte3 == parte4);
		System.out.println(parte3.equals(parte4));
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