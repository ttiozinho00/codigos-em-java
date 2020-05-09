public class conversao
{
	public static void main(String[] args) 
	{
		cls();
		double a = 20.5;
		float b = (float) a;
		System.out.println(b);

		float c = 934.5f;
		double d = c;
		System.out.println(d);
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