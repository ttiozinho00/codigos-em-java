import java.util.Scanner;

public class divisao
{

	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);
	
		System.out.print("Insira o valor do dividendo: ");
		int dividendo = leitura.nextInt();
		
		System.out.print("Insira o valor do divisor: ");
		int divisor = leitura.nextInt();
		
		if ((dividendo / divisor < 0)) 
		{
			System.out.println("Valor encontrado: 0");
		}
	
		else if (dividendo / divisor > 0) 
		{
			System.out.println("");
			System.out.println("Valor calculado: " + dividendo / divisor);
		}

		else 
		{
			System.out.println("-1");
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