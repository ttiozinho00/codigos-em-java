import javax.swing.JFrame;

public class Popup
{
	public static void main(String[] args)
	{
		cls();

		PopupFrame popupFrame = new PopupFrame();
 		popupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		popupFrame.setSize(300, 200);
 		popupFrame.setVisible(true);
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
