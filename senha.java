import java.util.*;

public class senha
{
	public static void main(String[] args) 
	{
		cls();
		boolean resultado = false;
		char check[] = {'!', '@', '#', '*', '&', '$'} ;	
		String senha = "******";

		for(char c : check)
		{
			if(senha.indexOf(c) == -1)
			{
				resultado = true;	
			}
		}

		if(resultado)
		{
			System.out.println("Senha válida");
		}

		else 
		{
			System.out.println("Senha inválida");	
		}
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