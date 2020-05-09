import java.util.Scanner;

public class voto
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		float porcentagem_candidato_a;
		float porcentagem_candidato_b;
		float porcentagem_brancos;
		float porcentagem_nulos;
		int candidato_a;
		int candidato_b;
		int total_votos;
		int brancos;
		int nulos;
		int voto;

		candidato_a = 0;
		candidato_b = 0;
		total_votos = 0;
		brancos = 0;
		nulos = 0;

		do
		{
			cls();
			System.out.println("Escolha seu candidato ou tecle zero para encerrar");

			System.out.println("  1 -> Candidato A");
			System.out.println("  2 -> Candidato B");
			System.out.println("  3 -> Branco\n");

			System.out.println("Qualquer número diferente de 0, 1, 2 e 3 anulará o seu voto\n");
			System.out.print("\nDigite seu voto: ");
			voto = leitura.nextInt();
			cls();

			switch(voto)
			{
				case 0:
					System.out.println("Votação encerrada!");
					break;

				case 1:
					candidato_a = candidato_a + 1;
					break;

				case 2:
					candidato_b = candidato_b + 1;
					break;

				case 3:
					brancos = brancos + 1;
					break;

				default:
					nulos = nulos + 1;
					break;						
			}
		}while(voto != 0);

		total_votos = candidato_a + candidato_b + brancos + nulos;

		if (total_votos > 0) 
		{
		porcentagem_candidato_a = (float) ((candidato_a * 100.0) / total_votos);  
			porcentagem_candidato_b = (float) ((candidato_b * 100.0) / total_votos);
			porcentagem_brancos = (float) ((brancos * 100.0) / total_votos);
			porcentagem_nulos = (float) ((nulos * 100.0) / total_votos);

			System.out.println("Total de votos: " + total_votos);
			System.out.println("\nCandidato A: " + candidato_a + " voto(s). " + porcentagem_candidato_a + " % do total");
			System.out.println("Candidato B: " + candidato_b + " voto(s). " + porcentagem_candidato_b + " % do total");
			System.out.println("Brancos: " + brancos + " voto(s). " + porcentagem_brancos + " % do total");
			System.out.println("Nulos: " + nulos + " voto(s). " + porcentagem_nulos + " % do total");
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