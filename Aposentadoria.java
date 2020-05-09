import java.util.*;
import java.util.Scanner;

public class Aposentadoria 
{
    public static void main(String[] args) 
    {
        cls();

        Scanner sc = new Scanner(System.in);
        double alvo;
        double juros;
        double contribuicao;
        int anos = 0;
        double saldo = 0;

        // exercicio: verifique valores informados abaixo s�o aceit�veis
        System.out.print("Quanto dinheiro voce quer para se aposentar: ");
        alvo = sc.nextDouble();

        System.out.print("Quanto dinheiro voce vai contribuir todo ano: ");
        contribuicao = sc.nextDouble();

        System.out.print("Taxa de juros em % (exemplo: digite 7.5 para 7.5%): ");
        juros = sc.nextDouble() / 100;

        while (saldo < alvo) 
        {
            saldo = (saldo + contribuicao) * (1 + juros);
            anos++;
        }

        System.out.println("Voce pode se aposentar em " + anos + " anos.");
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
