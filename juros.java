import java.util.*;

public class juros
{
	public static void main(String[] args) 
	{
		cls();

		double principal;
		double montante;
		double taxa;
		int ano;

		principal = 1000.0;
		taxa = 0.07;

		System.out.printf("%s%20s \n","Ano","Montante do Depósito");

		for (ano = 1;ano <= 10 ;ano++) 
		{
			montante = principal * Math.pow(1.0 + taxa,ano);
			System.out.printf("%4d%, 20.2f%\n",ano,montante);	
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