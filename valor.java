import java.util.*;
import java.util.Scanner;

public class valor 
{
    public static void main(String[] args) 
    {
        cls();

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.print("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();

        System.out.print("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();

        System.out.print("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();

        if (n1 > n2) 
        {
            if (n1 > n3) 
            {
                if (n2 < n3) 
                {
                    System.out.println("\n");
                    System.out.println("O menor numero eh: " + n2);
                } 

                else 
                {
                    System.out.println("\n");
                    System.out.println("O menor numero eh: " + n3);
                }

                System.out.println("O maior numero eh: " + n1);
            } 

            else 
            {
                if (n1 < n2) 
                {
                    System.out.println("\n");
                    System.out.println("O menor numero eh: " + n1);
                }

                else 
                {
                    System.out.println("\n");
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        }

        else 
        {
            if (n2 > n3) 
            {
                if (n1 < n3) 
                {
                    System.out.println("\n");
                    System.out.println("O menor numero eh: " + n1);
                }

                else 
                {
                    System.out.println("\n");
                    System.out.println("O menor numero eh: " + n3);
                }

                System.out.println("O maior numero eh: " + n2);
            }

            else 
            {
                if (n1 < n2) 
                {
                    System.out.println("\n");
                    System.out.println("O menor numero eh: " + n1);
                }

                else 
                {
                    System.out.println("\n");
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
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