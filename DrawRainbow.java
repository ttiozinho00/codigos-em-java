import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public  class DrawRainbow extends JPanel
{
	private final static Color VIOLET = new Color(128, 0,128); 
	private final static Color INDIGO = new Color(75, 0, 130);
	private static final long serialVersionUID = 1;

	private Color colors[] = {Color.WHITE,Color.WHITE,VIOLET,INDIGO,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};

	public DrawRainbow()
	{
		setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int radius;
		int count;
		radius = 20;

		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;

		for (count = colors.length;count > 0;count--) 
		{
			g.setColor(colors[count - 1]);
			g.fillArc(centerX - count * radius,centerY - count * radius,count * radius * 2,count * radius * 2, 0,180);
		}

	} 
}