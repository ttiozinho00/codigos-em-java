import java.awt.Graphics;
import javax.swing.JPanel;

public class cantoPanel extends JPanel
{
	private static final long serialVersionUID = 1;
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		int width = getWidth();
		int height = getHeight();


		g.drawLine(0, 0, width, height);
		g.drawLine(0, height,width,0);	

	}
}