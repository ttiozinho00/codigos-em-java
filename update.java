public class update
{
	public static void main(String[] args) 
	{
		cls();
		
		int passengers = 0;
        passengers = passengers + 5;
        passengers = passengers - 3;
        passengers = passengers - 1 + 5;
        System.out.println(passengers);	
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