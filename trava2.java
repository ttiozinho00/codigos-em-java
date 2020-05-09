import java.util.*;

public class trava2
{
	public static void main(String[] args) 
	{
		cls();

		trava chave = new trava();

		chave.trave();
		chave.destrave();
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