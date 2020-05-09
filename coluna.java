import java.util.*;

public class coluna
{
	public static void main(String[] args) 
	{
		cls();

		int coluna;
		int linha;

		linha = 10;

		while(linha >= 1)
		{
			coluna = 1;

			while(coluna <= 10)
			{
				System.out.printf("%d\n",linha,"<>");
				coluna++;
			}

			linha--;
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