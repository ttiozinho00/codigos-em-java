import javax.swing.JOptionPane; 
import java.util.*; 
      
public class terceiro 
{  
         
    public static void main (String args[])
    {  
            
        String Salario,MesesDeTrabalho;        
            
        Salario=JOptionPane.showInputDialog("Digite o seu Sal�rio:");  
        MesesDeTrabalho=JOptionPane.showInputDialog("Digite a quantidade de Meses que Trabalhou:");  
        String MostreResultado = String.valueOf(Float.parseFloat(Salario) / 12 * Float.parseFloat(MesesDeTrabalho));     
          
        String msg="Seu Decimo Terceiro �:" + MostreResultado;  
           
        JOptionPane.showMessageDialog(null,msg);  
     
        System.exit(0);      
    }  
}      