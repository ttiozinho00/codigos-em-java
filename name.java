public class name
{
	public static void main(String[] args) 
	{
		cls();

		String firstName = "Douglas";
	    String lastName = " Barreto Zanata";
	    String fullName = firstName + lastName;
	    int str = fullName.length();
	    
		System.out.println("Hello, my name is " + fullName);
		System.out.println("\nThere are " + str + " letters in my name");
	}

	public static void cls() 
    {
        try 
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

        catch (final Exception E) 
        {
            System.out.println(E);
        }
    }
}