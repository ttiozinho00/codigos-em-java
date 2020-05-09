public class DeckofCards1
{
	public static void main(String[] args) 
	{
		cls();

		DeckofCards myDeckofCards = new DeckofCards(); 
		myDeckofCards.shuffle();

		int i;

		for (i = 1;i <= 52;i++) 
		{
			System.out.printf("%-19s",myDeckofCards.dealcard());

			if ((i%4)==0) 
			{
				System.out.println("");		
			}	
		}
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