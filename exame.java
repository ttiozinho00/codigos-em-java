import java.util.*;
import java.util.Scanner;

public class exame
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int reprovados;
		int resultado;
		int aprovados;
		int aluno;

		aprovados = 0;
		reprovados = 0;
		aluno = 1;

		while(aluno <= 10)
		{
			System.out.print("Forneça resultado ( 1=aprovado,2=reprovado):");
			resultado = leitura.nextInt();

			if (resultado == 1)
			{
				aprovados = aprovados + 1;
			}

			else
			{
				reprovados = reprovados + 1;
			}
			aluno = aluno + 1;
		}

		System.out.println("");
		System.out.printf("Aprovados: %d\n",aprovados);
		System.out.printf("Reprovados: %d\n",reprovados);

		if (aprovados > 8)
		{
			System.out.println("");
			System.out.println("Bouns ao Instrutor!");
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