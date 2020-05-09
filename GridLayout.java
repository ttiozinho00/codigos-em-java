import javax.swing.JFrame;

public class GridLayout
{
	public static void main(String[] args) 
	{
		cls();

		GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
		gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gridLayoutFrame.setSize(300, 200);
		gridLayoutFrame.setVisible(true);		
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