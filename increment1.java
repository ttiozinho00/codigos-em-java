public class increment1
{
	public static void main(String[] args) 
	{
		cls();

		increment value = new increment(5);
		int i;

		System.out.printf("Antes do Incremento: %s\n\n",value);

		for (i = 0;i <= 3;i++) 
		{
			value.addIncrementToTotal();
			System.out.printf("Depois do Incremento: %d:%s\n",i,value);
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