import java.util.*;

public class maiusculas
{
	public static void main(String[] args) 
	{
		cls();
		char ch;
		int i;

		for(i=0; i < 10; i++)
		{
			ch = (char)('a' + i);

			System.out.print(ch);
			ch = (char) ((int) ch & 65503);
			System.out.print(ch + " ");
		}
		System.out.println("");	
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