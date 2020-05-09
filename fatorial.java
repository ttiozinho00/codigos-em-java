public class fatorial
{

	public static void main(String[] args)
	{
		cls();
		
		int counter;

		for (counter = 0; counter <= 21; counter++)
		{
			System.out.printf("%d! = %d%n", counter, fatorial(counter));
		}
	}

	public static long fatorial (long number)
	{
		if(number <= 1)
		{
			return 1;
		}
		else
		{
			return number * fatorial(number - 1);
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