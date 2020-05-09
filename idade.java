import java.util.Scanner;
import java.util.*;

public class idade
{
	public static void main(String[] args) 
	{
		cls();
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();

		String indicacao = (idade >= 18) ? "adulto" : "criança/adolescente";	

		System.out.println("Resultado: " + indicacao);	
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