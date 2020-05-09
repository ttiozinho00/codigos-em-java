import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class semente
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);
		Random gerador = new Random();

		int cont;
		int seed;

		System.out.print("Digite a semente:");
		seed = leitura.nextInt();

		for (cont = 0; cont <= 10;cont++) 
		{
			System.out.print("" + 1 +(gerador.nextInt()%6));
		}

		if ((cont%5)==0) 
		{
			System.out.println("");
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