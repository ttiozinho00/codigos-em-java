import java.util.Scanner;
import java.util.*;

public class vogal
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);	
		String letra;

		System.out.print("Digite uma letra: ");	
		letra = leitura.nextInt();

		if ((letra = 'A' || letra = 'E') || (letra = 'I' || letra = 'O') || (letra = 'U' || letra = 'a') || (letra = 'e' || letra = 'i') || (letra = 'o' || letra = 'u')) 
		{
			System.out.print("\nA letra " + letra + " é uma vogal");				
		}

		else
		{
			System.out.print("\nA letra " + letra + " é uma consoante");	
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