public class driver
{
	public static void main(String[] args) 
	{
		cls();
		String driver;
        driver = "Thomas";
        int numberLetters = driver.length();
        System.out.println(numberLetters);

        String driverUpper;
        driverUpper = driver.toUpperCase();
        System.out.println(driverUpper);	
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