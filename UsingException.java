public class UsingException
{
	public static void main(String[] args) 
	{
		cls();

		try
		{
			throwException();
		}

		catch(Exception exception)
		{
			System.err.println("Exception handled in main");	
		}
		doesNoThrowException();		
	}

	public static void throwException() throws Exception
	{
		try
		{
			System.out.println("Method throwException");
			throw new Exception();
		}

		catch(Exception exception)
		{
			System.err.println("Exception handled in method throwException");
			throw new Exception();
		}

		finally
		{
			System.err.println("Finally executed in throwException");	
		}
	}

	public static void doesNoThrowException()
	{
		try
		{
			System.out.println("Method doesNoThrowException");
		}

		catch(Exception exception)
		{
			System.err.println(exception);
		}

		finally
		{
			System.err.println("Finally executed doesNoThrowException");
		}
		System.out.println("End of method doesNoThrowException");
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