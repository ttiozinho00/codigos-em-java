import java.util.Date;

public class coletor
{
  
    public static void main(String[] args) 
    {
        cls();
        Date d = getDate();
        System.out.println("d = " + d);
    }
   
    public static Date getDate() 
    {
        Date d1 = new Date();
        StringBuffer now = new StringBuffer(d1.toString());
        System.out.println(now);
        return d1;
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