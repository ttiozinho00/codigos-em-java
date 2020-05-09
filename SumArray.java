public class SumArray
{
	public static void main(String[] args) 
	{
		cls();

		int array[] = {87,68,94,100,83,78,85,91,76,87};
		int total;
		int count;

		total = 0;

		for (count = 0;count < array.length;count++) 
		{
			total += array[count];			
		}
		System.out.printf("Total de elementos na array: %d\n",total);		
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