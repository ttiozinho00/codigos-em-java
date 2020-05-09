public class incremento
{
	public static void main(String[] args) 
	{
		int c;

		c = 10;

		cls();

		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println("");
		
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);		
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