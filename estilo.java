import java.util.*;

public class estilo
{
	public static void main(String[] args) 
	{
		cls();
		int num[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100,110,120,130,140,150,160,170,180,190,200};
		int sum;

		sum = 0;		

		for(int x : num)
		{
			System.out.println("Valor é: " + x);
			sum += x;
		}
		System.out.println("");
		System.out.println("Sumatório: " + sum);
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