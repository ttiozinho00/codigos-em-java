public class mundos
{
	public static void main(String[] args) 
	{
		cls();
		System.out.println("Hello Word");	
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