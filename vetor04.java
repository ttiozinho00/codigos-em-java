import java.util.Arrays;

public class vetor04
{
	public static void main(String[] args) 
	{
		cls();
		int vet[] = {1, 4, 5, 8, 9, 0, 23, 54, 128};	
		int po;

		for (int pos : vet) 
		{
			System.out.print(pos + "  ");			
		}

		System.out.println("");
		po = Arrays.binarySearch(vet,10);
		System.out.println("\nEncontrei o valor na posição " + po);

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