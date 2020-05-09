import javax.swing.JFrame;

public class label
{
	public static void main(String[] args) 
	{
		cls();

		LabelFrame labelFrame = new LabelFrame();
		labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelFrame.setSize(520, 360);
		labelFrame.setVisible(true);	
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