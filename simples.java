import java.util.*;
import java.util.Scanner;

public class simples
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float mult;
		float soma;
		float div;
		float sub;
		int a;
		int b;

		System.out.print("Informe o primeiro valor:");
		a = leitura.nextInt();

		System.out.print("Informe o segundo valor:");
		b = leitura.nextInt();

		soma = a+b;
		sub = a-b;
		div = a/b;
		mult = a*b;

		System.out.println("");
		System.out.println("A soma eh: " + soma);
		System.out.println("A subtração eh: " + sub);
		System.out.println("A divisão eh: " + div);
		System.out.println("A multiplicação eh:" + mult);

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