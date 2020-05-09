public class comp
{
	public static void main(String[] args) 
	{
		cls();
		String nome1 = "Douglas";
        String nome2 = "Douglas";
        String nome3 = new String("Douglas");
        String res;
        
        res = (nome1.equals(nome3)) ? "igual":"diferente";

        System.out.println(res);	
	}

	public static void cls() 
	{
		try 
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		catch (final Exception E) 
		{
			System.out.println(E);
		}
	}
}