import javax.swing.JOptionPane;
import java.util.*;

public class painel
{
	public static void main(String[] args) 
	{
		cls();
		JOptionPane.showMessageDialog(null,"Olá mundo");
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