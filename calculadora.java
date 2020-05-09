import javax.swing.*;
import java.util.*;

public class calculadora 
{
    public static void main(String[] args) 
    {
      
        String numA = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
        String numB = JOptionPane.showInputDialog(null, "Digite o segundo número:");

        double a = Double.parseDouble(numA);
        double b = Double.parseDouble(numB);
      
        double soma = a + b;
        double sub = a - b;
        double mult = a * b;
        double div = a / b;
        
        JOptionPane.showMessageDialog(null,"Soma: " + soma + "\n" +"Subtração: " + sub + "\n" +"Multiplicação: " + mult + "\n" +"Divisão: " + div);
    }
}