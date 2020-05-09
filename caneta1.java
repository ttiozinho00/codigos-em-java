public class caneta1
{
	public static void main(String[] args) 
	{
		cls();
		caneta c1 = new caneta();
		c1.cor = "Azul ";
		c1.ponta = 0.5f;
		c1.tampar();

		c1.status();
		c1.rabiscar();	

		caneta c2 = new caneta();
		c2.modelo = "Mas";
		c2.cor = "Preta";
		c2.destampar();

		c2.status();
		c2.rabiscar();	
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