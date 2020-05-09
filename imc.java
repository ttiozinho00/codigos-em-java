import java.util.Scanner;

public class imc
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		System.out.print("Peso: ");
		int peso = leitura.nextInt();

		System.out.print("Altura: ");
		double altura = leitura.nextDouble();
		double imc = peso / (altura * altura);

		if (imc < 18.5) 
		{
			System.out.println("Abaixo do peso ideal com: " + imc);
		}

		else if (imc < 25) 
		{
			System.out.println("Peso ideal com: " + imc);
		} 

		else if (imc < 30) 
		{
			System.out.println("Acima do peso com: " + imc);
		}

		else if (imc < 35) 
		{
			System.out.println("Obesidade grau I com: " + imc);
		}

		else if (imc < 40) 
		{
			System.out.println("Obesidade grau II com: " + imc);
		} 

		else 
		{
			System.out.println("Obesidade grau III com: " + imc);
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