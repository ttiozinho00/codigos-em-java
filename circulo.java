import java.awt.Color;
import javax.swing.JFrame;

public class circulo
{
	public static void main(String[] args) 
	{
		cls();

		JFrame frame = new JFrame("Drawing 2D Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		circuloJPanel circuloJPanel = new circuloJPanel();
		frame.add(circuloJPanel);
		frame.setBackground(Color.WHITE);
		frame.setSize(315, 330);
		frame.setVisible(true);	
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