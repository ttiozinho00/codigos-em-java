public class CommissionEmployee extends Object
{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String first, String last, String ssn, double sales, double rate)
	{
		firstName = first; 
		lastName = last;
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	public String setFirstName(String first)
	{
		return firstName = first;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void LastName(String last)
	{
		lastName = last;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getSocialSecurityNumber()
	{
		return socialSecurityNumber;
	}

	public void setGrossSales(double sales)
	{
		grossSales = (sales < 0.0) ? 0.0 : sales;
	}

	public double getGrossSales()
	{
		return grossSales;
	}

	public void setCommissionRate(double rate)
	{
		commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 00;
	}

	public double getCommissionRate()
	{
		return commissionRate;
	}

	public double earnings()
	{
		return commissionRate * grossSales;
	}

	@Override
	public String toString()
	{
		return String.format("%s: %s %s\n%s: %s\n%s %.2f\n%s: %.2f","commission employee",firstName, lastName,"social security number",socialSecurityNumber,"gross sales",grossSales,"commission rate",commissionRate);
	}
}