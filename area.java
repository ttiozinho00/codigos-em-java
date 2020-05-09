import java.util.*;
import java.util.Scanner;

public class area
{
	public static void main(String[] args) 
	{
		cls();

		Scanner leitura = new Scanner(System.in);

		float altura;
		float area;
		float base;

		System.out.print("Informe a altura:");
		altura = leitura.nextFloat();

		System.out.print("Informe a base:");
		base = leitura.nextFloat();

		area = (altura*base)/2;

		System.out.printf("\nO valor da area e de: %.2f\n",area);
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