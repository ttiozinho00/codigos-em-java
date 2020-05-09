import javax.swing.JFrame;

public class Panel
{
	public static void main(String[] args) 
	{
		cls();

		PanelFrame panelFrame = new PanelFrame();
		panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelFrame.setSize(450, 200);
		panelFrame.setVisible(true);		
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