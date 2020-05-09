import java.util.EnumSet;

public class ebook
{
	public static void main(String[] args) 
	{
		cls();
		System.out.println("Todos os livros:\n ");	

		for (book bok : book.values()) 
		{
			System.out.printf("%-10s%-45s%s\n", bok,bok.getTitle(),bok.getCopyrightYear());	
		}
		System.out.println("\nDisplay a range of enum constants:");

		for (book bok : EnumSet.range(book.JHTP, book.CPPHTP)) 
		{
			System.out.printf("%-10s%-45s%s\n",bok,bok.getTitle(),bok.getCopyrightYear());		
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