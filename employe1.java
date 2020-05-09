public class employe1
{
	public static void main(String[] args) 
	{
		cls();
		
		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		employe  teste = new employe("Bob","Blue",birth,hire);

		System.out.println(teste); 	
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