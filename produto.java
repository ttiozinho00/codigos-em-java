import java.util.*;
import java.util.Scanner;

public class produto
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int result;
		int x;
		int y;
		int z;

		System.out.print("Informe o primerio valor: ");
		x = leitura.nextInt();

		System.out.print("Informe o segundo valor: ");
		y = leitura.nextInt();
		
		System.out.print("Informe o terceiro valor: ");
		z = leitura.nextInt();

		result = x*y*z;

		System.out.println("");
		System.out.printf("O produto é %d",result);
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