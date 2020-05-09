//import static java.lang.Math.*;

public class estatico
{
	public static void main(String[] args) 
	{
		cls();

		float a  = 9;

		System.out.printf("sqrt(900.0) = %.1f\n",Math.sqrt(900.0));
		System.out.printf("ceil(-9.8) = %.1f\n",Math.ceil(-9.8));
		System.out.printf("log(E) = %.1f\n",Math.log(a));
		System.out.printf("cos(0.0) = %.1f\n",Math.cos(0.0));
		System.out.printf("pow(3,2) = %.1f\n",Math.pow(3,2));	
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