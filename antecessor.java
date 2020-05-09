import java.util.Scanner;
import java.util.*;


public class antecessor
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		int n1;
		int n2;
		int x;

		cls();

		System.out.print("Digite um número:");
		x = leitura.nextInt();

		n1=x+1;
		n2=x-1;

		System.out.printf("\n\nSeu sucessor e : %d",n1);
		System.out.printf("\n\nSeu antecessor e : %d",n2);
		System.out.println("");		
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