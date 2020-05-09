public class metodo
{
	/*o metodo principal */
	public static void main(String[] args) 
	{
		cls();
		String s1 = "testando o método escreva";
		escreva(s1);
	}

	/* metodo estatico escreva */
	public static void escreva(String frase)  
	{
	    System.out.println(frase);
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