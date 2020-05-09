import java.util.Scanner;
import java.util.*;

public class Assert
{
	public static void main(String[] args) 
	{
		cls();

		Scanner leitura = new Scanner(System.in);
		int num;

		System.out.print("Informe o valor between 0 e 10: ");
		num = leitura.nextInt();

		assert(num >= 0 && num <= 10) : "Número ruim" + num;

		System.out.printf("Você Venceu: %d\n",num);
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