import javax.swing.JFrame;

public class Menu
{
	public static void main(String[] args)
	{
		cls();

		MenuFrame menuFrame = new MenuFrame();
 		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		menuFrame.setSize(500, 200);
 		menuFrame.setVisible(true);
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
