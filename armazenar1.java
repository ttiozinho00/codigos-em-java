import java.util.*;

public class armazenar1
{
	public static void main(String[] args) 
	{
		cls();
		int gradesArray[][] = {{97,96,70},{68,87,90},{100,81,82},{83,65,85},{78,87,65},{85,75,83},{91,94,100},{76,72,84},{87,93,73}};

		armazenar book = new armazenar("CS101 Intrudução a programação em java.!!",gradesArray);

		book.displayMessage();
		book.processGrades();	
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