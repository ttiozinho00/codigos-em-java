public class tamanho
{
	public static void main(String[] args) 
	{
		cls();

		int vetor[] = new int[10];
		int i;

		System.out.println("Tamanho vetor: " + vetor.length);

		System.out.println("");
		for (i = 0; i < vetor.length; i++)	
		{
			vetor[i] = i;
			System.out.println(vetor[i]);
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