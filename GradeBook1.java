import java.util.*;

public class GradeBook1
{
	public static void main(String[] args) 
	{
		cls();

		GradeBook myGradeBook = new GradeBook("CS101 Introdu��o a progrma��o em java");
		myGradeBook.DisplayMessage();
		myGradeBook.determineClassAverage();			
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