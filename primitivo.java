public class primitivo
{
	public static void main(String[] args) 
	{
		cls();

		int n1;
		int n2;

		n1 = 2;
		n2 = 5;

		double resultado = n2/n1;

		System.out.println(resultado);	
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