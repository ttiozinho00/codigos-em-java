public class saldo
{
	public static void main(String[] args) 
	{
		cls();
		float saldoConta = 1030.43F; 
		System.out.println(saldoConta);	
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