import java.util.*;

public class prioridades
{

	public static void main(String[] args)
	{
		cls();
		double resultado;

		resultado = 5.0 + 4.0 * 2.0;	
		System.out.print("\nOperação: 5 + 4 * 2 = " + resultado);

		resultado = (5.0 + 4.0) * 2.0;
		System.out.print("\nOperação: (5 + 4) * 2 = " + resultado);

		resultado = 1.0 + 2.0 / 3.0 * 4.0;
		System.out.print("\nOperação: 1 + 2 / 3 * 4 = " + resultado);

		resultado = (1.0 + 2.0) / (3.0 * 4.0);
		System.out.print("\nOperação: (1 + 2) / (3 * 4) = " + resultado);

		System.out.println("");
	}

	public static void cls()
    {
        try
        {

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }

        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}