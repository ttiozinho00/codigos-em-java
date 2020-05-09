import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderFrame extends JFrame
{
	private static final long serialVersionUID = 1;
	private final JSlider diameterJSlider;
	private final OvalPanel myPanel;


	public SliderFrame()
	{

		super("Slider Demo");
	
		myPanel = new OvalPanel();
		myPanel.setBackground(Color.YELLOW);
	
		diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		diameterJSlider.setMajorTickSpacing(10);
		diameterJSlider.setPaintTicks(true);

		diameterJSlider.addChangeListener(
			new ChangeListener() 
 			{ 

		 		@Override 
 				public void stateChanged(ChangeEvent e) 
 				{ 
 					myPanel.setDiameter(diameterJSlider.getValue()); 
 				} 
			} 
		);

		add(diameterJSlider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
}