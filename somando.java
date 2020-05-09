public class somando
{
	public static void main(String[] args) 
	{
		int total;
		int num;
		total = 0;

		cls();

		for (num = 2;num <= 20;num += 2) 
		{
			total += num;
		}
		System.out.printf("A soma e de:%d\n",total);	
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