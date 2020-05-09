import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame
{
	private static final long serialVersionUID = 1;
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;

	public LabelFrame()
	{
		label1 = new JLabel("Label with text"); 
		label1.setToolTipText("This is label1");
		add(label1);

		Icon icon = new ImageIcon(getClass().getResource("./icon.png"));

		label2 = new JLabel("Label with text and icon" + icon,SwingConstants.LEFT);
		label2.setToolTipText("This is label2");
		add(label2);

		label3 = new JLabel();
		label3.setText("Label with icon and text at bottom"); 
		label3.setIcon(icon);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		add(label3);
	}
}