public class inverter
{
	public static void main(String[] args) 
	{
		cls();
		byte b = -34;
		int t;

		for(t=128; t > 0; t = t/2)
		{
			if((b & t) != 0)
			{
				System.out.print("1 ");
			}

			else
			{
				System.out.print("0 ");
			}
		}
		System.out.println("");	

		b = (byte) ~b;

		for(t=128; t > 0; t = t/2)
		{
			if((b & t) != 0)
			{
				System.out.print("1 ");
			}

			else
			{
				System.out.print("0 ");
			}
		}
		System.out.println("");	
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