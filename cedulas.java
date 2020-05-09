import java.util.Scanner;

public class cedulas
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);
		cls();

		int cinquenta; 
		int cinquenta1; 
		int cedulas;
		int	vinte1;  
		int vinte;
		int	cinco1;
		int cinco;
		int dois1;
		int dois;  
		int dez1;
		int dez;
		int cem; 
		int um1;   
		int um;

		System.out.print("Informe a quantias de cedulas: ");
		cedulas = leitura.nextInt();

		cem = cedulas/100;
		cinquenta = (cedulas%100);
		cinquenta1 = cinquenta/50;
		vinte = cinquenta%50;
		vinte1 = vinte/20;
		dez = vinte%20;
		dez1 = dez/10;
		cinco = dez%10;
		cinco1 = cinco/5;
		dois = cinco%5;
		dois1 = dois/2;
		um = dois%2;
		um1 = um/1;

		System.out.printf("\n%d nota(s) de R$ 100,00\n",cem);
		System.out.printf("%d nota(s) de R$ 50,00\n",cinquenta1);
		System.out.printf("%d nota(s) de R$ 20,00\n",vinte1);
		System.out.printf("%d nota(s) de R$ 10,00\n",dez1);
		System.out.printf("%d nota(s) de R$ 5,00\n",cinco1);
		System.out.printf("%d nota(s) de R$ 2,00\n",dois1);
		System.out.printf("%d nota(s) de R$ 1,00\n",um1);
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