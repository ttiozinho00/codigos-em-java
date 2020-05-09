import java.util.Scanner;

public class recuperacao
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float nrecup;
		float mrecup;
		float media;
		float n1;
		float n2;
		float n3;
		float n4;

		System.out.print("Digite a primeira nota: ");
		n1 = leitura.nextFloat();

		System.out.print("Digite a segunda nota: ");
		n2 = leitura.nextFloat();

		System.out.print("Digite a terceira nota: ");
		n3 = leitura.nextFloat();

		System.out.print("Digite a quarta nota: ");
		n4 = leitura.nextFloat();

		media = (n1+n2+n3+n4)/4;

		if(media >= 7)
		{
			System.out.println("\nO aluno está aprovado com média: " + media);
		}

		else
		{
			System.out.println("\nO aluno está de recuperação com média: " + media);
		}

		System.out.print("\nDigite a nota de recuperação: ");
		nrecup = leitura.nextFloat();

		mrecup = (media + nrecup)/2;

		if(mrecup >= 5)
		{
			System.out.println("\nO aluno foi aprovado na recuperação com media: " + mrecup);
		}

		else
		{
			System.out.println("\nO aluno não foi aprovado na recuperação com média: " + mrecup);	
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