public class enquete
{
	public static void main(String[] args) 
	{
		cls();

		int responses[] = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,1,2,12,14,1,5,4,3,6,8,0,15,20,1,3,4,5,6,8,9,4,3,5,3,4,3,5,2};
		int frequncia[] = new int[11];
		int rating;
		int answer;

		for (answer = 0;answer < responses.length; answer++) 
		{
			++frequncia[responses[answer]];	
		}
		System.out.printf("%s%10s","Elementos","Frequncia");

		for (rating = 1;rating < frequncia.length;rating++) 
		{
			System.out.printf("%d%10d",rating,frequncia[rating]);	
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