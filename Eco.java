public class Eco 
{
    public static void main(String[] args) 
    {
    	cls();

        for (int i = 0; i < args.length; i++) 
        {
            System.out.print(args[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < args.length; i++) 
        {
            System.out.println(args[i]);
        }
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