import javax.swing.JFrame;

public class FlowLayout
{
	public static void main(String[] args)
	{
		cls();
		FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
		flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		flowLayoutFrame.setSize(300, 75);
		flowLayoutFrame.setVisible(true);
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