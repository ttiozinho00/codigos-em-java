import java.util.*;

public class array
{
	public static void main(String[] args) 
	{
		cls();
		int array[] = new int[5];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		System.out.println("Valor do indice 0:" + array[0]);
		System.out.println("Valor do indice 1:" + array[1]);
		System.out.println("Valor do indice 2:" + array[2]);
		System.out.println("Valor do indice 3:" + array[3]);
		System.out.println("Valor do indice 4:" + array[4]);
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
