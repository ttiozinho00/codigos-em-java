import java.util.Scanner;
import java.util.*;

public class pesquisa 
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int vetor[] = {0,1, 3, 5, 7, 9};
		boolean achou = false;
		int posicao;
		int numero;

		System.out.print("Informe um valor: ");
		numero = leitura.nextInt();

		for (posicao = 0;posicao <= 5; posicao++) 
		{
			if (vetor[posicao] == numero) 
			{
				System.out.println("Encontrado na posi��o: " + posicao);
				achou = true;
			}
		}

		if (!achou) 
		{
			System.out.println("O n�mero n�o est� no vetor");	
		}
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