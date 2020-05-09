import java.util.*;

public class codificar
{
	public static void main(String[] args) 
	{
		cls();
		String msg = "Essa mensagem será codificada.!!";
		String encMsg = "";
		String decMsg = "";
		int key = 88;
		int i;	

		System.out.print("Mensagem original: ");
		System.out.println(msg);

		for(i=0; i < msg.length(); i++)
		{
			encMsg = encMsg + (char) (msg.charAt(i) ^ key);
		}
		System.out.print("Mensagem codificada: ");
		System.out.println(encMsg);

		for(i=0; i < msg.length(); i++)
		{
			decMsg = decMsg + (char) (encMsg.charAt(i) ^ key);
		}
		System.out.print("Mensagem decodificada: ");
		System.out.println(decMsg);
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