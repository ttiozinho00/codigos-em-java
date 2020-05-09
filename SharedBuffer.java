import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBuffer
{
	public static void main(String[] args) throws InterruptedException
	{
		cls();

		ExecutorService executorService = Executors.newCachedThreadPool();
		Buffer sharedLocation = new UnsynchronizedBuffer();

		System.out.printf("%-40s%s\t\t%s%n%-40s%s%n%n", "Operation","Buffer", "Occupied", "---------", "------\t\t--------");
		executorService.execute(new Producer(sharedLocation));
		executorService.execute(new Consumer(sharedLocation));
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
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