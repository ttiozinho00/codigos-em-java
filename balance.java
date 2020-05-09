public class balance
{
	public static void main(String[] args) 
	{
		cls();

		double balance = 0;
		balance = balance + 20; 
		balance = balance - 25; 
		balance = balance + 30; 
		balance = balance - 25; 

		if (balance < 0) 
		{
			System.out.println("Estamos no vermelho!");
		}

		else if (balance > 0) 
		{
			System.out.println("Estamos lucrando!");
		}

		else 
		{
			System.out.println("Estamos quebrados.");
		}	
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