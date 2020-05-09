import java.util.*;
import java.util.Scanner;

public class par
{
	public static void main(String[] args) 
	{
		cls();

		Scanner sc = new Scanner(System.in);
		int i;

		System.out.print("Informe o valor:");
		i = sc.nextInt();
	
		if ((i%2)==0) 
		{
			System.out.println("");
			System.out.println("O numero e Par");	
		}

		else
		{
			System.out.println("");
			System.out.println("O numero e Impar");
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