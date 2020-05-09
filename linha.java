public class linha
{
	public static void main(String[] args) 
	{
		cls();

		int matriz[][] = new int[2][3];	
		int i;
		int j;

		for(i = 0; i < matriz.length; i++)
		{
			System.out.println("\nLinha: " + i);

			for(j = 0; j < matriz[i].length; j++)
			{
				matriz[i][j]= i+1;
				System.out.print("\nValores da coluna: ");
				System.out.println(matriz[i][j]);
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