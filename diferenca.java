import java.util.Scanner;

public class diferenca
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		cls();

		int diferenca;
		int a;
		int b;
		int c;
		int d;

		System.out.print("Informe o primeiro valor: ");	
		a = leitura.nextInt();

		System.out.print("Informe o segundo valor: ");	
		b = leitura.nextInt();

		System.out.print("Informe o terceiro valor: ");	
		c = leitura.nextInt();

		System.out.print("Informe o quarto valor: ");	
		d = leitura.nextInt();

		diferenca = a*b-c*d;

		System.out.printf("\ndiferença %d\n",diferenca);
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