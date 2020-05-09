import java.util.Scanner;
import java.util.*;

public class contador
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int contador;
		int numero;
		int soma;

		soma = 0;

		System.out.print("Digite um valor: ");
		numero = leitura.nextInt();

		for (contador = 0; contador <= numero; contador ++) 
		{
			soma = soma + contador;		
		}
		System.out.println("A soma de 1 até " + numero + " é: " + soma);
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