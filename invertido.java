import java.util.*;
import java.util.Scanner;

public class invertido
{
    public static void main(String[] args) 
    {
    	cls();

        final int N�MEROS_A_LER = 10;
        Scanner sc = new Scanner(System.in);
        int[] n�meros = new int[N�MEROS_A_LER]; 

        for (int i = 0; i < n�meros.length; i++) 
        {
            System.out.print("Entre com o proximo inteiro: ");
            n�meros[i] = sc.nextInt();
        }

        System.out.println("");
        for (int i = n�meros.length - 1; i >= 0; i--) 
        {

            System.out.println(n�meros[i]);
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