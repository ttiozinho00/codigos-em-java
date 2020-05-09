import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

	public class ArraysAndStreams2
 	{
 		public static void main(String[] args)
		{
			cls();

 			String strings[] = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

 			System.out.printf("Original strings: %s%n", Arrays.asList(strings));
 			System.out.printf("strings in uppercase: %s%n",Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));
			System.out.printf("strings greater than m sorted ascending: %s%n",Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));
			System.out.printf("strings greater than m sorted descending: %s%n",Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));
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