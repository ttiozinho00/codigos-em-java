import java.util.*;

public class vetor01
{
	public static void main(String[] args) 
	{
		cls();

		int n[] = {1,2,3,8,7,2,6,8,7};
		int i;

		for (i = 0;i < n.length - 1;i++) 
		{
			System.out.println("Na posição " + i + " Temos o valor " + n[i]);	
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