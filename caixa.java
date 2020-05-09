import javax.swing.JOptionPane;
import java.util.*;

public class caixa
{
	public static void main(String[] args) 
	{
		cls();

		String nome = JOptionPane.showInputDialog("Qual seu nome");
		String mensagem = String.format("Bem-Vindo %s, a programação java!!",nome);
		JOptionPane.showMessageDialog(null,mensagem);
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