import java.util.Scanner;

public class consistencia
{
	public static void main(String[] args) 
	{
		cls();

		Scanner leitura = new Scanner(System.in);

		int idade;

		do
		{
			System.out.print("Informe sua idade (valores aceitos de 5 a 150): ");
			idade = leitura.nextInt();

		}while(idade < 5 || idade > 150);

		System.out.println("Correto");	
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