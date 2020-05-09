import java.util.Scanner;

public class salario
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		cls();
		
		float ht;
		float vh;
		float sb;

		System.out.print("digite a quantidade de horas trabalhadas: ");
		ht = leitura.nextInt();

		System.out.print("digite o valor de horas trabalhadas: ");
		vh = leitura.nextInt();

		sb = ht*vh;

		System.out.println("O salario bruto é: " + sb);
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