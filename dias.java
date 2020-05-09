import  java.util.Scanner;

public class dias 
{
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);

		cls();

		double num;
		double ano;
		double mes;
		double dia;

		System.out.print("Informe os dias:");
		num = leitura.nextInt();

		ano = Math.floor(num / 365);
		mes = Math.floor((num % 365)/30);
		dia = (num % 365) % 30;	

		if (mes >=12)
		{
			ano = ano + Math.floor(mes/12);
			mes %= 12;
		}
		System.out.printf("%.f ano(s)\n%.f mes(es)\n%.f dia(s)\n", ano, mes, dia);
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