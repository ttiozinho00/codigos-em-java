	import java.util.*;

public class somatorio
{
	public static void main(String[] args) 
	{
		cls();

		int numero;
		int soma;
		
		soma = 0;

		for (numero = 2; numero <= 100; numero++) 
		{
			soma += numero;	
		}

		System.out.println("" + soma);	
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