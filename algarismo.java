public class algarismo
{
	public static void main(String[] args) 
	{
		cls();

		int algarismo = 1;
		int numeros;
		int aux;

		numeros = 327;
		aux = algarismo;

		while(numeros == 0)
		{
			aux = aux / 10;
			algarismo = algarismo + 1;
		}

		System.out.println(algarismo + " é o número de algarismos de " + numeros);
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