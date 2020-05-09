import java.awt.Container;
import java.text.ParseException;  
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;
import javax.swing.JFrame;

  
public class janela extends JFrame 
{
  
    private static final long serialVersionUID = 1;
        
    public static void main(String[] args)  
    {  
        cls();
      
    	JFrame teste = new JFrame();
      	teste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teste.setSize(400, 250);
		teste.setVisible(true);	
    }
  
    private void janela() 
    {
        Container caixa = getContentPane();
        setLayout(null);
  
        JLabel labelCep = new JLabel("CEP: ");
        JLabel labelTel = new JLabel("Telefone: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelData = new JLabel("Data: ");
        labelCep.setBounds(50,40,100,20);
        labelTel.setBounds(50,80,100,20);
        labelCpf.setBounds(50,120,100,20);
        labelData.setBounds(50,160,100,20);
  
        MaskFormatter mascaraCep = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraData = null;
  
        try
        {
            mascaraCep = new MaskFormatter("#####-###");
            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraCpf = new MaskFormatter("#########-##");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCep.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');
        }

        catch(ParseException excp) 
        {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }
  
        JFormattedTextField jFormattedTextCep = new JFormattedTextField(mascaraCep);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
        jFormattedTextCep.setBounds(150,40,100,20);
        jFormattedTextTel.setBounds(150,80,100,20);
        jFormattedTextCpf.setBounds(150,120,100,20);
        jFormattedTextData.setBounds(150,160,100,20);
              
        caixa.add(labelCep);
        caixa.add(labelTel);
        caixa.add(labelCpf);
        caixa.add(labelData);
        caixa.add(jFormattedTextCep);
        caixa.add(jFormattedTextTel);
        caixa.add(jFormattedTextCpf);
        caixa.add(jFormattedTextData);
        //setSize(400, 250);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
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