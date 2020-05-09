public class casting
{
	public static void main(String args[]) 
    { 
     	cls();

        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);
        int approx = (int) future;
        System.out.println(approx);

        int x = 5;
        int y = 2;
        double div = x/y;

        System.out.println(div);
 
        double accurate = (double) x/y;
        System.out.println(accurate);

        double maths = 97.5;
        double english = 98;
        double science = 83.5;
        double drama = 75;
        double sum = maths + english + science + drama;
        double average = sum/4;
        System.out.println(average);

        int x1 = 0;
        int y1 = 4;
        double z = 3;
        x1 = x1+2;
        z = x1+y1-7;
        y1 = x1*3;

        System.out.println(" x = "+x1);
        System.out.println(" y = "+y1);
        System.out.println(" z = "+z);
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