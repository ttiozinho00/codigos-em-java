import java.util.Scanner;

public class quociente
{
	public static int quotient(int num1, int num2)
	{
		return num1 / num2;
	}

	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int result;
		int num1;
		int num2;

		System.out.print("Informe o Valor: "); 		
		num1 = leitura.nextInt();

		System.out.print("Informe o Deniminador: "); 		
		num2 = leitura.nextInt();

		result = quotient(num1, num2);
		System.out.printf("%nResult: %d / %d = %d%n", num1, num2, result);
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