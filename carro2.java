import java.util.*;

public class carro2
{
	public static void main(String[] args) 
	{
		cls();

		carro c4 = new carro();
		c4.ligar();
		c4.freio = false;
		c4.trocarmarcha();
		c4.acelerar(20);

		c4.trocarmarcha();
		c4.acelerar(40);

		c4.trocarmarcha();
		c4.acelerar(60);

		c4.desligar();

		carro ix35 = new carro();	
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