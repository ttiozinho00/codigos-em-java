public class employee
{
	private String firstName;
	private String lastName;
	private static int count = 0;

	public employee(String first, String last)
	{
		firstName = first;
		lastName = last;	
		++count;

		System.out.printf("Employee constructor: %s %s: count =%d\n",firstName,lastName,count);
	} 

	public String getfirstName()
	{
		return firstName;
	}

	public String getlastName()
	{
		return lastName;
	}

	public static int getCount()
	{
		return count;
	}
}