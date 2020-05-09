import java.util.Scanner;
import java.util.*;

public class consumo
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);


		float distancia;
		float consumo;
		int velmedia;
		int horas;

		System.out.print("Informe o tempo gasto na viagem em horas: ");
		horas = leitura.nextInt();

		System.out.print("Informe a velocidade média do veículo: ");
		velmedia = leitura.nextInt();

		distancia = horas * velmedia;
 		consumo = distancia / 12;

 		System.out.printf("\nForam gastos %4.2f de combustivel\n",consumo); 

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