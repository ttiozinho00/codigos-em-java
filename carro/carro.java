public class carro
{
	public static void main(String[] args) 
	{
		cls();
		
		fabrica meuCarro = new fabrica();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;

		meuCarro.liga();
		meuCarro.acelera(20);	
		System.out.println(meuCarro.velocidadeAtual);
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