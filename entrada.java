import java.util.*;

public class entrada
{
	public static void main(String[] args) 
	{
		cls();
		String entrada = "1";
		entrada = entrada+"1";

		Integer numero = Integer.parseInt(entrada);
		System.out.println(entrada);
		System.out.println(numero);
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