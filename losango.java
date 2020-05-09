import java.util.*;
import java.util.Scanner;

public class losango
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int lado1;
		int lado2;
		float area;

		System.out.print("Informe a diagonal maior: ");
		lado1 = leitura.nextInt();

		System.out.print("Informe a diagonal menor: ");
		lado2 = leitura.nextInt();

		area = (lado1*lado2)/2;

		System.out.println("");
		System.out.println("" + area);
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