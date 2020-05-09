import javax.swing.JFrame;

public class canto 
{
	public static void main(String[] args) 
	{
		cls();
		cantoPanel panel = new cantoPanel();

		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel);
		application.setSize(250,250);
		application.setVisible(true);	
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