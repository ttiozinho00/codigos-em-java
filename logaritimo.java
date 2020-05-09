public class logaritimo
{
	public static void main(String[] args) 
	{
		cls();

		double s = 0.0;
		double t = Math.exp(1.0);
		double i = 1.0;
		double x = 21397534.0;
		double y = 0.0;
		double x0 = x;
		double t0 = t;	
		int flag = 0;

		if (0<t && t<1) 
		{ 
			flag = ~flag; 
			t = 1/t; 
		}

		do 
		{
			while (x>t && t>1)
			{
				y += i; 
				x/=t; 
			}

			s += y;
			y = 0.0;
			t = Math.sqrt(t);
			i /=2.0;
		}while(t>1);

		if (flag == 0) 
		{ 
			s = -s; 
			t = 1/t; 
		}
		System.out.printf("%15.25f\n %15.25f\n %15.25f\n", t0, s, Math.pow(t0,s));
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