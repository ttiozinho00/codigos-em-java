public class squares
{
	public static void main(String[] args)
	{
		cls();
		int sqrs[][] = {{1, 1},{2, 4},{3, 9},{4, 16},{5, 25},{6, 36},{7, 49},{8, 64},{9, 81},{10, 100}};
		int i;
		int j;

		for(i=0; i < 10; i++)
		{
			for(j=0; j < 2; j++)
			{
				System.out.print(sqrs[i][j] + " ");
			}
			System.out.println();
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