import javax.swing.*;
import java.util.*;

public class calculadora 
{
    public static void main(String[] args) 
    {
      
        String numA = JOptionPane.showInputDialog(null, "Digite o primeiro n�mero:");
        String numB = JOptionPane.showInputDialog(null, "Digite o segundo n�mero:");

        double a = Double.parseDouble(numA);
        double b = Double.parseDouble(numB);
      
        double soma = a + b;
        double sub = a - b;
        double mult = a * b;
        double div = a / b;
        
        JOptionPane.showMessageDialog(null,"Soma: " + soma + "\n" +"Subtra��o: " + sub + "\n" +"Multiplica��o: " + mult + "\n" +"Divis�o: " + div);
    }
}