import java.util.*;

public class scape
{
	public static void main(String[] args) 
	{
		cls();
		System.out.println("oi \"é só\"um teste\"");	
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