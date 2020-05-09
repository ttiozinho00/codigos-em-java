public class reta1
{
	public static void main(String[] args) 
	{
		cls();

		Reta ar;
		ar=new Reta((float)0.0,(float)0.0,(float)1.0,(float)1.0);
		ar.mostra();	
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