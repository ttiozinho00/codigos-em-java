import java.util.Scanner;

public class recursivo
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int numero;

		System.out.print("Informe um valor: ");
		numero = leitura.nextInt();	

		System.out.printf("\nO fatorial de: %d e de: %d \n",numero,fatorial(numero));
	}

	public static int fatorial(int numero)
	{
		if (numero == 1 || numero == 0)
		{
			return 1;
		}

		return numero * fatorial(numero -1);
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