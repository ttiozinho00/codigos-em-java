import java.util.Scanner;

public class codigo
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);
		cls();

		int codigo;
		int outro;
		char cla;

		System.out.print("Digite o c�digo da pesquisa: ");	
		codigo = leitura.nextInt();

		switch (codigo) 
		{
			case 1:
				System.out.println("\nAlimento n�o perec�vel"); 
				break;

			case 2:
				System.out.println("\nAlimento perec�vel"); 
				break;

			case 3:
				System.out.println("\nHigiene pessoal"); 
				break;
					
			case 4:
				System.out.println("\nLimpeza e ultens�liosdomesticos"); 
				break;		

			default:
				System.out.print("\nOp��o inv�lido escolha outra:");
				outro = leitura.nextInt();	
				break;
		}
	}

	public static void cls() 
	{
		try 
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		catch (final Exception E) 
		{
			System.out.println(E);
		}
	}
}