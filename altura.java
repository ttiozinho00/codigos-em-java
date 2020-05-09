import java.util.*;
import java.util.Scanner;

public class altura
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);
		
		int altura1;
		int altura2;
		int altura3;
		float media_altura;

		System.out.print("Digite a altura da primeira pessoa: ");
		altura1 = leitura.nextInt();

		System.out.print("Digite a altura da segunda pessoa: ");
		altura2 = leitura.nextInt();	

		System.out.print("Digite a altura da terceira pessoa: ");
		altura3 = leitura.nextInt();

		media_altura = (altura1+altura2+altura3)/3;

		System.out.println("");
		System.out.print("" + Math.floor(media_altura));		
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