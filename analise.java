import java.util.Scanner;
import java.util.*;

public class analise
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		int contStundantes;
		int result;
		int repro;
		int apro;

		contStundantes = 1;
		repro = 0;
		apro = 0;

		cls();

		while (contStundantes <= 10) 
		{
			System.out.print("Informe o resultado(1 = aprovado ou 2 = reprovado):");
			result = leitura.nextInt();

			if (result == 1) 
			{
				apro = apro + 1;			
			}

			else
			{
				repro = repro + 1;
			}
			contStundantes = contStundantes + 1;		
		}
		System.out.println("");	
		System.out.printf("Aprovado: %d\nReprovado:%d\n",apro, repro);

		if (apro > 8) 
		{
			System.out.println("\nBonus ao Instrutor!!");			
		}	
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