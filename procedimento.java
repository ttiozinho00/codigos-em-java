import java.util.*;

public class procedimento
{
	public static void main(String[] args) 
	{
		cls();
		mensagem("Bem Vindo");	

		System.out.print("\nO resultado do primeiro c�lculo �: " + calcula(3.0, 4.0)); 
		System.out.print("\nO resultado do segundo c�lculo �: " + calcula (7.0, 2.0));
		System.out.println("");

		mensagem("Tchau");	
	}

	public static void mensagem(String texto)
	{
		int i;

		for (i = 0; i < 50; i++) 
		{
			System.out.print("-");	
		}
		System.out.print("\n" + texto + "\n");

		for (i = 0; i < 50; i++) 
		{
			System.out.print("-");	
		}
		System.out.println("");
	}

	public static double calcula(double a,double b)
	{
		double resultado;

		resultado = a * a + b * b;

		return resultado;
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