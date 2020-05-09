import java.util.*;

public class fracao1
{
	public static void main(String[] args) 
	{
		cls();

		fracao a;
		fracao b;
		fracao c;

		a = new fracao(5,3);
		b = new fracao(2,6);

		System.out.print("Esta é fração a: ");
		a.mostra();

		System.out.print("Esta é fração b: ");
		b.mostra();
		System.out.println("");


		c = a.soma(b);

		System.out.print("c de a+b: ");
		c.mostra();

		System.out.print("a*b: ");
		c=a.multiplicacao(b);
		c.mostra();

		System.out.print("a+b: ");
		c=a.soma(b);
		c.mostra();
		System.out.println("");

		System.out.print("a>=b: ");
		System.out.println(a.maiorouigual(b));

		System.out.print("a==b: ");
		System.out.println(a.igual(b));

		System.out.print("a!=b: ");
		System.out.println(a.diferente(b));
		System.out.println("");

		System.out.print("(int)a: ");
		System.out.println(a.converteint());

		System.out.print("(double)a: ");
		System.out.println( a.convertedbl());
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