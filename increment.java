public class increment
{
	private int total = 0;
	private final int INCREMENT;

	public increment(int incrementValue)
	{
		INCREMENT = incrementValue;
	}

	public void addIncrementToTotal()
	{
		total += INCREMENT;
	}

	public String toString()
	{
		return String.format("total = %d",total);
	}
}