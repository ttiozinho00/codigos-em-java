public class ATMCaseStudy
{
	public static void main(String[] args) 
	{
		cls();
		ATM theATM = new ATM();
		theATM.run();	
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