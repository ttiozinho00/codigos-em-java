import javax.swing.JOptionPane;
import java.util.*;

public class Media 
{
    public static void main(String[] args) 
    {
 
        int quantidadeFuncionarios = 0;
        float salarioFuncionario = 0;
        float totalSalarios = 0;
        float mediaSalarial = 0;
      
        int contadora = 0;
         
         cls();
        quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcion�rios","N�mero de funcion�rios",JOptionPane.QUESTION_MESSAGE));
         
        while (contadora < quantidadeFuncionarios)
        {
            contadora++;
            salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o sal�rio do funcion�rio","Sal�rio",JOptionPane.QUESTION_MESSAGE));
            totalSalarios = totalSalarios + salarioFuncionario;
        }
         
        mediaSalarial = totalSalarios / quantidadeFuncionarios;
        System.out.println("M�dia Salarial = " + mediaSalarial);
 
        System.exit(0);
    }

    public static void cls() 
    {
        try 
        {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

        catch (final Exception E) 
        {
            System.out.println(E);
        }
    }
}