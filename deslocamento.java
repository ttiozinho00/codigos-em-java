public class deslocamento
{
	public static void main(String[] args)
	{
		cls();

		int val;
		int i;
		int t;	

		val = 128;

		for(i = 0; i < 8; i++)
		{
			for(t=128; t > 0; t = t/2)
			{
				if((val & t) != 0)
				{
					System.out.print("1 ");
				}

				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println("");
			val = val << 1;
		}
		System.out.println("");	

		for(i = 0; i < 8; i++)
		{
			for(t=128; t > 0; t = t/2)
			{
				if((val & t) != 0)
				{
					System.out.print("1 ");
				}
				
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println("");
			val = val >> 1;
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