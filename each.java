import java.util.*;

public class each
{
	public static void main(String[] args) 
	{
		cls();

		int num[][] = new int[3][5];
		int sum;
		int i;
		int j;

		sum = 0;

		for(i = 0; i < 3; i++)
		{
			for(j=0; j < 5; j++)
			{
				num[i][j] = (i+1)*(j+1);
			}
		}

		for(int x[] : num)
		{
			for(int y : x)
			{
				System.out.println("Valor é: " + y);
				sum += y;
			}
		}
		System.out.println("");
		System.out.println("Summation: " + sum);
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