public class funcao 
{
	public static void main(String[] args) 
	{
		cls();

		int sm;

		sm = soma(5,5);

		System.out.println("A soma é: " + sm);
	}

	public static int soma(int a, int b)
	{
		int s;

		s = a + b;

		return s;	
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