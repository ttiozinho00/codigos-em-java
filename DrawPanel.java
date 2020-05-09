import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;


public class DrawPanel extends JPanel
{
	private static final long serialVersionUID = 1;
	private Random randomnum = new Random();
	private MyLine[] lines;

	public DrawPanel()
	{
		setBackground(Color.WHITE);
		int count;

		lines = new MyLine[5 + randomnum.nextInt(5)];

		for (count = 0;count < lines.length;count++) 
		{
			int x1 = randomnum.nextInt(300);
			int y1 = randomnum.nextInt(300);
			int x2 = randomnum.nextInt(300);
			int y2 = randomnum.nextInt(300);

			Color color = new Color(randomnum.nextInt(256),randomnum.nextInt(256),randomnum.nextInt(256));
			lines[count] = new MyLine(x1,y1,x2,y2,color);
		}
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		for (MyLine line : lines) 
		{
			line.draw(g);	
		}
	}	
} 