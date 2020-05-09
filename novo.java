import java.util.*;

public class novo
{
	public static void main(String[] args) 
	{
		cls();

		int mes;
		int ano;
		int dia;

		dia = 0;
		ano = 0;
		mes = 0;

		if ((dia == 1) && (mes == 1) && (ano == 2020)) 
		{
			System.out.print("Feliz Ano Novo");
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