import java.util.Scanner;

public class quantia
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		float valor1;
		float valor2;
		float total;
		int quant1;
		int quant2;
		int cod1;
		int cod2;

		System.out.print("Informe o primeiro codigo:");
		cod1 = leitura.nextInt();

		System.out.print("Informe a primeira quantia:");
		quant1 = leitura.nextInt();

		System.out.print("Informe o primeiro valor:");
		valor1 = leitura.nextFloat();

		System.out.print("\nInforme o segundo codigo:");
		cod2 = leitura.nextInt();

		System.out.print("Informe a segunda quantia:");
		quant2 = leitura.nextInt();

		System.out.print("Informe o segundo valor:");
		valor2 = leitura.nextFloat();

		total = ((quant1*valor1)+(quant2*valor2));

		System.out.printf("\nValor a pagar: R$ %.2f\n",total);	
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