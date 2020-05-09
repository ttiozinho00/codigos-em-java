import javax.swing.JFrame;

public class Shapes
{
	public static void main(String[] args) 
	{
		cls();

		JFrame frame = new JFrame("Drawing 2D shapes");
	 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	ShapesJPanel shapesJPanel = new ShapesJPanel();

	 	frame.add(shapesJPanel);
	 	frame.setSize(425, 200);
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