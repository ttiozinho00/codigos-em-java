import java.awt.Dimension;
import java.util.Locale;
import java.awt.Toolkit;
import java.util.Date;
import java.util.*; 

public class sistema 
{
	public static void main(String[] args) 
	{
		cls();

		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Locale loc = Locale.getDefault();
        Dimension d = tk.getScreenSize();   
		Date relogio = new Date();

        System.out.println("A hora do sistema é: " + relogio.toString());
        System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage());
        System.out.println("A resolução do seu sistema é: "  + d.width + " X " + d.height);	
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
