public class bidimensional
{
	public static void main(String[] args) 
	{
		cls();
		int table[][] = new int[3][4];
		int i;
		int t;

		for(t=0; t < 3; ++t)
		{
			for(i=0; i < 4; ++i)
			{
				table[t][i] = (t*4)+i+1;
				System.out.print(table[t][i] + " ");
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