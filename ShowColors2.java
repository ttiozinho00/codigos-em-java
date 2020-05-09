import javax.swing.JFrame;

public class ShowColors2
{
	public static void main(String[] args) 
	{
		cls();

		ShowColors2JFrame application = new ShowColors2JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
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