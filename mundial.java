import java.util.*;

public class mundial
{
	public static void main(String[] args) 
	{
		cls();
		long populacaoMundial = 7000000000L; 
		System.out.println(populacaoMundial);
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