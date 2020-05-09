import java.util.*;

public class cha
{
	public static void main(String[] args) 
	{
		cls();
		char turmaAluno1 = 'A';
		char tipoCliente = '2';
		char simbolo = '@';

		System.out.println(turmaAluno1);
		System.out.println(tipoCliente);
		System.out.println(simbolo);
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