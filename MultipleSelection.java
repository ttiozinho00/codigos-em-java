import javax.swing.JFrame;

public class MultipleSelection
{
	public static void main(String[] args) 
	{
		MultipleSelectionFrame multipleSelection = new MultipleSelectionFrame();
		multipleSelection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		multipleSelection.setSize(350, 150);
		multipleSelection.setVisible(true);
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