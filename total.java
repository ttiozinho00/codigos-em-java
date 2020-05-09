public class total
{
	public static void main(String[] args) 
	{
		cls();

		int total;
		int x;
		int y;

		total = 0;
		x = 1;

		while (x <= 10) 
		{
			y = x*x;
			System.out.println(y);
			total += y;
			++x;
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