public class CommissionEmployee1
{
	public static void main(String[] args) 
	{
		cls();

		CommissionEmployee employee = new CommissionEmployee("Sue","Jones","222-22-2222",1000,.06);

		System.out.printf("Employee information obtained by get method: \n");
		System.out.printf("%s %s\n","First name is 	",employee.getFirstName());
		System.out.printf("%s %s\n","Last name is ",employee.getLastName());
		System.out.printf("%s %s\n","Social security number is ",employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f\n","Gross sales is ",employee.getGrossSales());
		System.out.printf("%s %.2f\n","commission rate is ",employee.getCommissionRate());

		employee.setGrossSales(500);
		employee.setCommissionRate(.1);

		System.out.printf("\n%s\n\n%s\n","Updated employee information obtaned by toString",employee);
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
