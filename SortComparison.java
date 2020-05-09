import java.time.Duration;
import java.time.Instant;
import java.text.NumberFormat;
import java.util.Arrays;
import java.security.SecureRandom;

public class SortComparison
{
	public static void main(String[] args)
	{
		cls();

		SecureRandom random = new SecureRandom();

		int array1[] = random.ints(15_000_000).toArray();
		int array2[] = new int[array1.length];
		System.arraycopy(array1, 0, array2, 0, array1.length);

		System.out.println("Starting sort");
		Instant sortStart = Instant.now();
		Arrays.sort(array1);
		Instant sortEnd = Instant.now();

		long sortTime = Duration.between(sortStart, sortEnd).toMillis();
		System.out.printf("Total time in milliseconds: %d%n%n", sortTime);

		System.out.println("Starting parallelSort");
		Instant parallelSortStart = Instant.now();
		Arrays.parallelSort(array2);
		Instant parallelSortEnd = Instant.now();
		long parallelSortTime = Duration.between(parallelSortStart, parallelSortEnd).toMillis();

		System.out.printf("Total time in milliseconds: %d%n%n",parallelSortTime);
		String percentage = NumberFormat.getPercentInstance().format((double) sortTime / parallelSortTime);

		System.out.printf("%nsort took %s more time than parallelSort%n",percentage);

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