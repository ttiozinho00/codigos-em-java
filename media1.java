import java.util.Scanner;

public class media1
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float media;
		float a;
		float b;

		System.out.print("Informe a primeira nota: ");
		a = leitura.nextFloat();

		System.out.print("Informe a segunda nota: ");
		b = leitura.nextFloat();

		media = (float)( a*3.5+b*7.5)/11;

		System.out.printf("\nMEDIA = %.5f\n",media);
	}

	public static void cls() 
    {
        try 
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

        catch (final Exception E) 
        {
            System.out.println(E);
        }
    }
}