import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles
{
	public static void main(String[] args) 
	{
		try
		{
			File file = new File("test.txt"); 
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter("\\z");
			System.out.println(scanner.next());
		}

		catch(FileNotFoundException e)
		{
			System.out.println("Arquivo nao encontrado!");
			e.printStackTrace();
		}
	}
}