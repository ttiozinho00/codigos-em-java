public class conectar
{
	public static void main(String[] args)
	{
		cls();

		String s1 = "Happy ";
		String s2 = "Birthday";

		System.out.printf("s1 = %s%ns2 = %s%n%n",s1, s2);
		System.out.printf("Result of s1.concat(s2) = %s%n",s1.concat(s2));
		System.out.printf("s1 after concatenation = %s%n", s1);
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