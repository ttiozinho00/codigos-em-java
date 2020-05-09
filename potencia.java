import java.util.*;
import java.util.Scanner;

public class potencia
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int potencia;
		int i;
		int x;
		int y;	

		potencia = 1;
		i = 1;

		System.out.print("Informe o valor de x:");
		x = leitura.nextInt();

		System.out.print("Informe o valor de y:");
		y = leitura.nextInt();

		while(i <= y)
		{
			potencia *= x;
			++i;
		}

		System.out.println("");
		System.out.println("" + potencia);	
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