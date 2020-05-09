import java.util.Scanner;

public class soma
{
    public static void main(String[]args)
    {
        cls();
    
        int numero1, numero2, soma;

        Scanner sc = new Scanner(System.in);

   
        System.out.print("Entre com o primeiro número inteiro: ");
        numero1 = sc.nextInt();
        System.out.print("Entre com o segundo número inteiro: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;
        System.out.printf("A soma de %d e %d resulta em %d\n",numero1, numero2, soma);
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
