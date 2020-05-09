import java.util.*;

public class main
{
	public static void main(String[] args) 
	{
		cls();

		corrente poupanca = new corrente(8461, 103445, true);
		pessoa p = new pessoa("João", 20, poupanca);

		System.out.println(p.getNome());
		System.out.println(p.getIdade());

		poupanca.depositar(1000);
		poupanca.sacar(100);

		System.out.println(poupanca.getSaldo());		
		
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