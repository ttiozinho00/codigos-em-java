public class conta1
{
	public static void main(String[] args) 
	{
		cls();
		
		Conta conta = new Conta();
		conta.deposita(100.0);

		System.out.println(conta.getSaldo());	
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

