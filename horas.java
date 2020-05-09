import java.util.Date;
import java.util.*;

public class horas
{
	public static void main(String[] args) 
	{
		cls();
		Date relogio = new Date();
        System.out.println("A hora do sistem é: " + relogio.toString());
        //System.out.print(relogio.toString());	
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