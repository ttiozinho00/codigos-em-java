import java.util.Scanner;
import java.util.*;

public class triangulo
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);	

		int lado_a; 
		int lado_b;
		int lado_c;

		System.out.print("Informe o primeiro lado do triângulo: ");
		lado_a = leitura.nextInt();

		System.out.print("Informe o segundo lado do triângulo: ");
		lado_b = leitura.nextInt();

		System.out.print("Informe o terceiro lado do triângulo: ");
		lado_c = leitura.nextInt();

		if ((lado_a == lado_b) && (lado_a == lado_c)) 
		{
			System.out.println("\nEste triângulo é Equilátero");
		}

		else
		{
			if (lado_a == lado_b || lado_b == lado_c || lado_c == lado_a) 
			{
				System.out.println("\nEste triângulo é Isósceles");
			}

			else
			{
				System.out.println("\nEste triângulo é Escaleno");	
			}	
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