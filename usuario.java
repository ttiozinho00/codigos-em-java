import java.util.Scanner;

public class usuario
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		String nome;
		int idade;

		System.out.print("Digite o seu nome: ");	
		nome = leitura.nextLine();

		System.out.print("Digite a sua idade: ");
		idade = leitura.nextInt();

		System.out.println("\nO seu nome é " + nome + " é sua idade e de " + idade + " anos");	
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