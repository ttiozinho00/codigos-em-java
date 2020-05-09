import java.util.*;

public class populacao
{
	public static void main(String[] args) 
	{
		cls();
		long populacaoUberlandia = 650000;
		System.out.println(populacaoUberlandia);
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