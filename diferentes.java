public class diferentes
{
	public static void main(String[] args) 
	{
		int column;
		int row;

		row = 10;

		cls();
		while (row >= 1) 
		{
			column = 1;

			while (column <= 10) 
			{
				System.out.println(row %2 == 1 ? "<" : ">");
				++column;		
			}
			--row;

			System.out.println("");	
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