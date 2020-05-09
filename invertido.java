import java.util.*;
import java.util.Scanner;

public class invertido
{
    public static void main(String[] args) 
    {
    	cls();

        final int NÚMEROS_A_LER = 10;
        Scanner sc = new Scanner(System.in);
        int[] números = new int[NÚMEROS_A_LER]; 

        for (int i = 0; i < números.length; i++) 
        {
            System.out.print("Entre com o proximo inteiro: ");
            números[i] = sc.nextInt();
        }

        System.out.println("");
        for (int i = números.length - 1; i >= 0; i--) 
        {

            System.out.println(números[i]);
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