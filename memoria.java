import java.util.Date;
import java.util.*;

public class memoria
{
	public static void main(String[] args) 
	{
		int i;

		cls();
		Runtime rt = Runtime.getRuntime();

		System.out.println("Memória antes da criação dos objetos: " + rt.freeMemory());
		System.out.println("Memória total da JVM: " + rt.totalMemory());

		Date d = null;

		for (i = 0; i < 100000; i++) 
		{
			d = new Date();
      		d = null;
		}
		System.out.println("Memória depois da criação dos objetos: " + rt.freeMemory());
    	rt.gc();
    	System.out.println("Memória depois executar o gc: " + rt.freeMemory());
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