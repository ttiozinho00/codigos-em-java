import java.util.*;
import java.util.Scanner;

public class nota
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		String nome;
		float media;
		int n1;
		int n2;
		int n3;
		int n4;

		System.out.print("Informe o nome do aluno:");
		nome = leitura.nextLine();

		System.out.print("Informe a primeira nota:");
		n1 = leitura.nextInt();

		System.out.print("Informe a segunda nota:");
		n2 = leitura.nextInt();

		System.out.print("Informe a terceira nota:");
		n3 = leitura.nextInt();

		System.out.print("Informe a quarta nota:");
		n4 = leitura.nextInt();

		media = (n1+n2+n3+n4)/4;

		System.out.println("\nO aluno " + nome + " está com a média de " + media);	
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