public class minusculo
{
	public static void main(String[] args) 
	{
		char ch;
		int i;

		cls();
		for(i=0; i < 10; i++)	
		{
			ch = (char)('A' + i);
			System.out.print(ch);

			ch = (char) ((int) ch | 32);
			System.out.print(ch + " ");
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