import javax.swing.*;
import java.util.*;


public class Sorteio 
{
    public static Object Sorteio;
    private int numero;

    public int Sorteio() 
    {
        Random gerador = new Random();
       return numero = (int) (1 + (Math.random() * 10)); 
    }

    public int getNumero() 
    {
        return this.numero;
    }

    public void setNumero(int n) 
    {
        numero = n;
    }

    public static void main(String args[]) 
    {
        Sorteio Sorteio1 = new Sorteio();
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor entre 1 e 10"));

        if (resposta == Sorteio1.getNumero()) 
        {
            JOptionPane.showMessageDialog(null, "Você acertou o primeiro sorteio");
        }

        else 
        {
            JOptionPane.showMessageDialog(null, "Você errou o primeiro sorteio. \n O valor sorteado foi " + Sorteio1.getNumero());
        }
       
           
        Sorteio Sorteio2=new Sorteio();
        int resposta2=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor entre 1 e 10"));

        if (resposta2 ==Sorteio2.getNumero())
        {
            JOptionPane.showMessageDialog(null,"Você acertou o segundo sorteio");
        }

        else
        {
            JOptionPane.showMessageDialog(null,"Você errou o segundo sorteio. \n O valor sorteado foi " +Sorteio2.getNumero());
        }

        Sorteio Sorteio3=new Sorteio();
        int resposta3=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor entre 1 e 10"));

        if (resposta3==Sorteio3.getNumero())
        {
            JOptionPane.showMessageDialog(null,"Você acertou o terceiro sorteio");
        }

        else
        {
            JOptionPane.showMessageDialog(null,"Você errou o terceiro sorteio. \n O valor sorteado foi "+Sorteio3.getNumero());
        }

        System.exit(0);             
    }
}
