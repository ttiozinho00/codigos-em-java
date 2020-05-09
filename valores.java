public class valores
{
	public static void main(String[] args) 
	{
		cls();
		long x = 9300000035L;
		int y = (int) x;
		System.out.println(y);		
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