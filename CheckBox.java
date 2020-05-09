import javax.swing.JFrame;

public class CheckBox
{
	public static void main(String[] args) 
	{
		cls();

		CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
		checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		checkBoxFrame.setSize(275, 100);
		checkBoxFrame.setVisible(true);
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