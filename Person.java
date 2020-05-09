public class Person
{
	private int addressID;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;

	public Person()
	{	
	}

	public Person(int addressID, String firstName, String lastName,String email, String phoneNumber)
	{
		setAddressID(addressID);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
	}

	public void setAddressID(int addressID)
	{
		this.addressID = addressID;
	}

	public int getAddressID()
	{
		return addressID;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getEmail()
	{
		return email;
	}

	public void setPhoneNumber(String phone)
	{
		this.phoneNumber = phone;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}
}