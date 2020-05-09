public class hexadecimal
{
	public static void main(String[] args) 
	{
		cls();
		char digitos[] = new char[16];
		int i;

		for(i=0; i < 16; i++)
		{
			if(i < 10)
			{
				digitos[i] = (char)('0' + i);
			}

			else
			{
				digitos[i] = (char)('A' + i - 10);
			}
		}

		String digitosStr = new String(digitos);
		System.out.println(digitosStr);

		String nineToTwelve = new String(digitos, 9, 4);
		System.out.println(nineToTwelve);	

		String digitosStr2 = new String(digitosStr);
		System.out.println(digitosStr2);

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