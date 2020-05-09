import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals
{
	public static void main(String[] args) 
	{
		cls();
		JFrame frame = new JFrame("Desenhando linhas, retângulos e ovais");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LinesRectsOvalsJPanel linesRectsOvalsJPanel = new LinesRectsOvalsJPanel();
		linesRectsOvalsJPanel.setBackground(Color.WHITE);
		frame.add(linesRectsOvalsJPanel);
		frame.setSize(400, 210);
		frame.setVisible(true);	
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