import java.util.Scanner;
import java.util.*;

public class ddd
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int n;

		System.out.print("Informe o DDD:");
		n = leitura.nextInt();

		if(n == 61)
		{
		 	System.out.println("\nBrasília\n");
		}

		else if(n == 67)
		{
		 	System.out.println("\nCampo Grande\n");
		}

		else if(n == 71)
		{
		 	System.out.println("\nSalvador\n");
		}

		else if(n == 11)
		{
		 	System.out.println("\nSão Paulo\n");
		}

		else if(n == 21)
		{
		 	System.out.println("\nRio de Janeiro\n");
		}

		else if(n == 32)
		{
		 	System.out.println("\nJuiz de Fora\n");
		}

		else if(n == 19)
		{
		 	System.out.println("\nCampinas\n");
		}

		else if(n == 27)
		{
		 	System.out.println("\nVitória\n");
		}

		else if(n == 31)
		{
		 	System.out.println("\nBelo Horizonte\n");
		}

		else 
		{
		 	System.out.println("\nDDD não cadastrado\n");
		}
	}

	public static void cls() 
    {
        try 
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

        catch (Exception E) 
        {
            System.out.println(E);
        }
    }
}