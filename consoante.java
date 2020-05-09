import java.util.*;
import java.util.Scanner;

public class consoante
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		char consoante;
		char vogal;

		vogal = 'a';

		System.out.print("Informe uma consoante:");	
		consoante =(char)leitura.nextInt();

		System.out.println("" + vogal + consoante);
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