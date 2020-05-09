public class copiaarray
{
	public static void main(String[] args) 
	{
		cls();
		int num1[] = new int[10];
		int num2[] = new int[10];
		int i;

		for(i=0; i < num1.length; i++)
		{
			num1[i] = i;
		}

		if(num2.length >= num1.length)
		{
			for(i = 0; i < num1.length; i++)
			{
				num2[i] = num1[i];
			}
		}

		for(i=0; i < num2.length; i++)
		{
			System.out.print(num2[i] + " ");
		}
		System.out.println("");
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