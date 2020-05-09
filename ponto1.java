public class ponto1
{
	public static void main(String[] args) 
	{
		cls();

		Ponto ap;
		ap = new Ponto((float)0.0, (float)0.0);
		ap.mostra();
		ap.move(1,1);
		ap.mostra();
		ap.x = 100;
		ap.mostra();
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