import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

public class angulo
{

	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);
		cls();

		float result;
		int a;
		int b;

		System.out.print("Informe o primeiro angulo:");
		a = leitura.nextInt();

		System.out.print("Informe o segundo angulo:");
		b = leitura.nextInt();

		result = (a^b)/2;

		System.out.printf("%.f\n",result);			
	}

	public  static float calc(float n1, float n2)
	{
		float result;

		result = n1*n2;

		return (result);
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