public class Factorial2
{
 	public static long factorial(long number)
	{
 		long result = 1;
		long i;	

		for (i = number; i >= 1; i--)
		{
			result *= i; 
		}
		return result;
	}

	public static void main(String[] args)
	{
		cls();
		long counter;

		for (counter = 0; counter <= 10; counter++)
  		{
			System.out.printf("%d! = %d%n", counter, factorial(counter));
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