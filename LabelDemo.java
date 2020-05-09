import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo
{
	public static void main(String[] args) 
	{
		cls();

		JLabel northLabel = new JLabel("North");
		ImageIcon labelIcon = ImageIcon("images/icon2.gif");
		JLabel centerLabel = new JLabel(labelIcon);
		JLabel southLabel = new JLabel(labelIcon);
		southLabel.setText("South");

		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(northLabel, BorderLayout.NORTH);
		application.add(centerLabel, BorderLayout.CENTER);
		application.add(southLabel, BorderLayout.SOUTH);
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