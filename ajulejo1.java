import java.util.Scanner;

public class ajulejo1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		cls();

		System.out.print("Insere o comprimento em metros ");
        double comprimento = in.nextDouble();

        System.out.print("Insere a altura em metros ");
        double altura = in.nextDouble();

		Ajulejo ajulejo = new Ajulejo(comprimento, altura);

		double area = ajulejo.calcularArea();
		int qtd_azulejos = ajulejo.calcularQtdAzulejos(area);
		double gasto_azulejos = ajulejo.calcularValorGasto(qtd_azulejos);

		String resposta1 = "", resposta2 = "";
		resposta1 = "\nQuantidade de azulejos necessaria: " + qtd_azulejos;
		ajulejo.imprimeFrase(resposta1);
		resposta2 = "Valor gasto com azulejos: R$ " + gasto_azulejos;
		ajulejo.imprimeFrase(resposta2);
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