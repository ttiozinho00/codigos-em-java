import java.util.*;
import java.util.Scanner;

public class comparacao
{
	public static void main(String[] args) 
	{
		cls();
		Scanner leitura = new Scanner(System.in);

		int num1;
		int num2;

		System.out.print("Informe o primeiro valor:");
		num1 = leitura.nextInt();	

		System.out.print("Informe o segundo valor:");
		num2 = leitura.nextInt();	

		System.out.println("");
		
		if (num1 == num2) 
		{
			System.out.printf("%d == %d\n",num1,num2);
		}

		if (num1 != num2) 
		{
			System.out.printf("%d != %d\n",num1,num2);	
		}

		if (num1 < num2) 
		{
			System.out.printf("%d < %d\n",num1,num2);
		}

		if (num1 > num2) 
		{
			System.out.printf("%d > %d\n",num1,num2);
		}

		if (num1 <= num2) 
		{
			System.out.printf("%d <= %d\n",num1,num2);
		}

		if (num1 >= num2) 
		{
			System.out.printf("%d >= %d\n",num1,num2);
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