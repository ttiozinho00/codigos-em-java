public class hora
{
	private int hour;
	private int minute;
	private int second;

	public void setTime(int hour, int minute, int second)
	{
		if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60)
		{
			throw new IllegalArgumentException("hour, minute and/or second was out of range");
		}

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}	

	public String toUniversalString()
	{
		return String.format("%d:%02d:%02d %s",((hour == 0 || hour == 12) ? 12 : hour % 12),minute, second, (hour < 12 ? "AM" : "PM"));
	}

	public static void main(String[] args)
 	{
		hora time = new hora(); 
		displayTime("After time object is created", time);
		System.out.println("");
		time.setTime(13, 27, 6);
		displayTime("After calling setTime", time);

		System.out.println("");

		try
		{
			time.setTime(99, 99, 99); 
		}

 		catch (IllegalArgumentException e)
		{
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		displayTime("After calling setTime with invalid values", time);
	}

	private static void displayTime(String header, Time t)
	{
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",header, t.toUniversalString(),t.toString());
	}
}