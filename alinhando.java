public class alinhando
{
	public static void main(String[] args) 
	{
		cls();
		System.out.printf("%10s%10d%10c%10f\n\n","olá",7,'a',1.23);
		System.out.printf("%-10s%-10d%-10c%-10f\n","olá",7,'a',1.23);	
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