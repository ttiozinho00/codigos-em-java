public class InitArray1
{
	public static void main(String[] args) 
	{
		int array[] = {36,11,24,67,35,12,99};
		int count;

		cls();

		System.out.printf("%s%8s\n","Index","Valor");

		for (count = 0;count < array.length;count++) 
		{
			System.out.printf("%5d%8d\n",count,array[count]);		 		
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