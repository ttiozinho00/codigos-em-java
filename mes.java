import java.util.*;

public class mes
{
	public static void main(String[] args) 
	{
		cls();

		String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;

		for (i = 0;i < mes.length;i++) 
		{
			System.out.println("O mês de " + mes[i] + " tem " + tot[i] + " dias.");		
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