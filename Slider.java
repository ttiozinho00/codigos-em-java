import javax.swing.JFrame;

public class Slider
{
	public static void main(String[] args)
	{
		cls();

		SliderFrame sliderFrame = new SliderFrame();
		sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sliderFrame.setSize(220, 270);
		sliderFrame.setVisible(true);
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