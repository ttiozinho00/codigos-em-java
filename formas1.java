import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class formas1
{
	public static void main(String[] args) 
	{
		cls();

		String input = JOptionPane.showInputDialog("Digite 1 para forma retangular.!!\n" + "Digite 2 para forma Oval.!!");
		int choice = Integer.parseInt(input);
		formas panel = new formas(choice); 

		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
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