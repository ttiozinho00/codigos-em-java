public class employee1
{
	public static void main(String[] args) 
	{
		cls();

		System.out.printf("Employees before instantiation: %d\n",employee.getCount());

		employee e1 = new employee("Susan","Baker");
		employee e2	= new employee("Bob","Blue");

		System.out.println("\nEmployees after instantiation: ");
		System.out.printf("via e1.getCount(): %d\n",e1.getCount());		
		System.out.printf("via e2.getCount(): %d\n",e2.getCount());
		System.out.printf("via employee.getCount(): %d\n",employee.getCount());
		System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n",e1.getfirstName(),e1.getlastName(),e2.getfirstName(),e2.getlastName());

		e1 = null;
		e2 = null;
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