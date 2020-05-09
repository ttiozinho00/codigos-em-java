import javax.swing.JFrame;

public class KeyDemo
{
	public static void main(String[] args) 
	{
		cls();
		KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
		keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		keyDemoFrame.setSize(350, 100);
		keyDemoFrame.setVisible(true);	
	}

	public static void cls() 
	{
		try 
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		catch (final Exception E) 
		{
			System.out.println(E);
		}
	}
}