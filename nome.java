import java.util.Scanner;

public class nome 
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = leitura.nextLine();
		System.out.println("Oi " + nome);
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