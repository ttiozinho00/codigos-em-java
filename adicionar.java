import javax.swing.JOptionPane;

public class adicionar
{
	public static void main(String[] args) 
	{
		cls();
		String firstNumber = JOptionPane.showInputDialog("Informe o primeiro numero: "); 
		String secondNumber = JOptionPane.showInputDialog("Informe o segundo numero: ");
		
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		int sum = number1 + number2;

		JOptionPane.showInputDialog(null, "A soma dos " + sum +" dois numeros", JOptionPane.PLAIN_MESSAGE);
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