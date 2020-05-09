public class contac
{
	public static void main(String[] args) 
	{
		cls();

		String driverFirstName;
        driverFirstName = "Thomas";
        String driverLastName;
        driverLastName = "Henricksen";
        String driverFullName;
        driverFullName = driverFirstName + " " + driverLastName;
        System.out.println(driverFullName);  

        // Other example with string concatenation 
        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops + 1;
        fare = fare + 3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println("The bus made $" + fare + " after "+stops+" stops");

        // yet another example with string concatenation
        String language = "java";
        String feeling = "Love";
        feeling = feeling.toLowerCase();
        language = language.toUpperCase();
        System.out.println("I "+ feeling + " "+ language);	
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