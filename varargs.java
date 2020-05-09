import java.util.*;

public class varargs 
{
	public static double average(double number)
	{
		double total;

		total = 0.0;

		for (double d : number) 
		{
			total += d;
		}
		return total / number.length;
	}

	public static void main(String[] args) 
	{
		cls();

		double d1 = 10.0;
		double d2 = 20.0;	
		double d3 = 30.0;	
		double d4 = 40.0;

		System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",d1,d2,d3,d4);
		System.out.printf("A média de d1 d2 é: %.1f ",average(d1,d2));
		System.out.printf("A média de d1, d2 e d3 é: %.1f ",average(d1,d2,d3));
		System.out.printf("A média de d1, d2, d3 e d4 é: %.1f ",average(d1,d2,d3,d4));		
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