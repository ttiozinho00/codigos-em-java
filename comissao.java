import java.util.Scanner;
import java.util.*;

public class comissao
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float comissao;
		float salario;
		float vendas;
		float total;
		String nome;

		System.out.print("Informe sue nome: ");
		nome = leitura.nextLine();

		System.out.print("Informe o salario:");
		salario = leitura.nextFloat();

		System.out.print("Informe as vendas:");
		vendas = leitura.nextFloat();

		comissao = (float)(vendas*0.15);
		total = (salario + comissao);

		System.out.printf("\nTOTAL = R$ %.2f\n",total);		
	}

	public static void cls() 
    {
        try 
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

        catch (Exception E) 
        {
            System.out.println(E);
        }
    }
}