import java.util.Scanner;

public class aluno
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		cls();
		int notaAluno1;
		int notaAluno2; 
		int notaAluno3;

		System.out.print("Informe a primeira nota: ");
		notaAluno1 = leitura.nextInt();

		System.out.print("Informe a segunda nota: ");
		notaAluno2 = leitura.nextInt();

		System.out.print("Informe a terceira nota: ");
		notaAluno3 = leitura.nextInt();

		int totalGeral = (notaAluno1 + notaAluno2 + notaAluno3)/3;

		System.out.println("\nA media e de: " + totalGeral);
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