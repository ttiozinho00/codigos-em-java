public class variavel
{
	public static void main(String[] args) 
	{
        cls();
		System.out.println("Hello, World"); 
        System.out.println("");
        System.out.println(3+5); 	
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