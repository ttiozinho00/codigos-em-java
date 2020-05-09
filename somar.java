import java.util.*;

public class somar
{
	public static void somar(int... num)
	{
		int soma;
		//int valor;

		soma = 0;

		for (int valor:num) 
		{
			soma += valor;
		}
		System.out.print(soma);
	}

	public static void main(String[] args) 
	{
		cls();

		somar(2,5,67,8,9);
		somar(1,2,3);
		somar(100);

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