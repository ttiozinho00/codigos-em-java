import java.util.*;

public class mundo
{
	public static void main(String[] args) 
	{
        cls();
		System.out.println("\n");
		System.out.println("ola mundo");	
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