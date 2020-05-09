public class principal
{
	public static void main(String[] args) 
	{
		cls();

		int circulo;

		umcirc = new circulo();
		umcirc.x = 0;
		umcirc.y = 0;	
		umcirc.raio = 12;
		System.out.println("" + umcirc.raio);
		umcirc.move(10,10);
		System.out.println("" + umcirc.move);
		umcirc.x = 100;
		System.out.println("" + umcirc.x);

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