public class coisa 
{
	static String s1 = "qualquer coisa";

	/* O metodo principal */
	public static void main(String[] args) 
	{
		cls();
		System.out.println("imprimindo o valor de s1 de dentro da função main");
		System.out.println("s1 = " + s1);
		/* chamada do metodo escreva frase */
		escreva_Frase();
		System.out.println("De volta para a função main");
	}

	/* O metodo estatico escreva frase */
	public static void escreva_Frase()  
	{
		System.out.println("imprimindo o valor de s1 de dentro da função escreva_Frase.");
		System.out.println("s1 = " + s1);
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