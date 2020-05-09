public class binario
{
	public static void main(String[] args)
	{
		cls();
		byte val;
		int t;

		val = 123;

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