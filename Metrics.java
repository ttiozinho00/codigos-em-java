import javax.swing.JFrame;

public class Metrics
{
	public static void main(String[] args)
	{
		cls();

		JFrame frame = new JFrame("Demonstrating FontMetrics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MetricsJPanel metricsJPanel = new MetricsJPanel();

		frame.add(metricsJPanel);
		frame.setSize(510, 240);
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