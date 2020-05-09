import java.util.*;

public class EntraDados
{
	public static void main(String[] args) 
	{
		cls();

		byte vetortexto[] = new byte[200];
		int byteslidos = 0;

		System.out.print("Digite a informação: ");

		try
		{
			byteslidos = System.in.read(vetortexto);
			System.out.print("Informação digitada: ");
			System.out.write(vetortexto,0,byteslidos);
		}
		catch(Exception e)
		{
			System.out.println(e);
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