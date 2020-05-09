import javax.swing.JFrame;

public class List
{
	public static void main(String[] args)
 	{
 		cls();
 		ListFrame listFrame = new ListFrame(); 
 		listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		listFrame.setSize(350, 150);
 		listFrame.setVisible(true);
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