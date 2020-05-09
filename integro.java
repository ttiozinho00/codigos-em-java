import java.util.*;

public class integro
{
	public static void main(String[] args) 
	{
		cls();

		Integer a = 6;
		Integer b = 6;

		Integer c = 128;
		Integer d = 128;

		System.out.println(a == b);
		System.out.println(c == d); 	
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