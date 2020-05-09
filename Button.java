import javax.swing.JFrame;

public class Button
{
	public static void main(String[] args)
	{
		cls();

		ButtonFrame buttonFrame = new ButtonFrame();
 		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonFrame.setSize(275, 110);
		buttonFrame.setVisible(true);
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