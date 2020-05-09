import java.util.*;

public class Lambda 
{
    public static void main(String[] args)
    {
         cls();

        new Thread(() -> 
        {
            System.out.println("Executando a Thread. Espere 1 segundo.");

            try 
            {
                Thread.sleep(1000);
            } 

            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println("Finalizando a Thread.");
        }).start();

        System.out.println("Finalizou a thread main.");
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