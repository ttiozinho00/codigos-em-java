import javax.swing.JFrame;

public class ComboBox
{
	public static void main(String[] args) 
	{
		cls();
		ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
		comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		comboBoxFrame.setSize(350, 150);
		comboBoxFrame.setVisible(true);		
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