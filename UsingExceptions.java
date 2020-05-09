import java.util.*; 

public class UsingExceptions
{
	public static void main(String[] args) 
	{
		cls();

		try
		{
			method1();	
		}

		catch(Exception exception)
		{
			System.err.printf("%s\n\n",exception.getMessage());

			exception.printStackTrace();
			StackTraceElement[] traceElements = exception.getStackTrace();

			System.out.println("\nStack trce para getStacktrace: ");
			System.out.println("Class\t\tFila\t\tLinha\tMethodo");

			for (StackTraceElement element : traceElements) 
			{
				System.out.printf("%s\t",element.getClassName());
				System.out.printf("%s\t",element.getFileName());	
				System.out.printf("%s\t",element.getLineNumber());	
				System.out.printf("%s\t",element.getMethodName());					
			}
		}
	}

	public static void method1() throws Exception
	{
		method2();
	}

	public static void method2() throws Exception
	{
		method3();
	}

	public static void method3() throws Exception
	{
		throw new Exception("Exception thrown in method3"); 
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