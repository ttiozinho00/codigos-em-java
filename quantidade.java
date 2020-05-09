import java.util.*;

public class quantidade
{
	public static void main(String[] args) 
	{
		cls();
		int quantidade = 10;
		System.out.println(quantidade);
		quantidade = 15;
		System.out.println(quantidade);	
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