public class texto
{
	public static void main(String[] args) 
	{
		cls();

		String s1 = "Texto";
		String s2 = new String("Texto");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));	
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