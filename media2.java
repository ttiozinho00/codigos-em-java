import java.util.Scanner;

public class media2
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float media;
		float a;
		float b;
		float c;

		System.out.print("Informe a primeira nota: ");
		a = leitura.nextFloat();

		System.out.print("Informe a segunda nota: ");
		b = leitura.nextFloat();

		System.out.print("Informe a terceira nota: ");
		c = leitura.nextFloat();

		media = (a*2+b*3+c*5)/10;

		System.out.printf("\nMEDIA = %.1f\n", media);
	}

	public static void cls() 
    {
        try 
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

        catch (Exception E) 
        {
            System.out.println(E);
        }
    }
}