public class Craps1
{
	public static void main(String[] args) 
	{
		cls();

		Craps game = new Craps();
		game.play();
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