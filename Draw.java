import javax.swing.JFrame;

public class Draw
{
	public static void main(String[] args) 
	{
		cls();

		DrawPanel panel = new DrawPanel();
		JFrame application = new JFrame(); 

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
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