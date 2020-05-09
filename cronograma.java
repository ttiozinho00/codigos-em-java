import java.util.*;

public class cronograma
{
	public static void main(String[] args) 
	{
		cls();

		String cronograma = "Academia pela manhã!!";
		int diaDaSemana = 1;

		switch(diaDaSemana)
		{	
			case 1:
				System.out.println("Segunda-feira " + cronograma);
				break;

			case 2:
				cronograma = "classe após o trabalho!!";
				System.out.println("Terça-feira " + cronograma);
				break;

			case 3:
				cronograma = "reuniões o dia todo!!";	
				System.out.println("Quarta-feira " + cronograma);
				break;	

			case 4:
				cronograma = "trabalhe em casa!!";
				System.out.println("Quinta-feira " + cronograma);
				break;

			case 5:
				cronograma = "Noite de jogos depois do trabalho!!";
				System.out.println("Sexta-feira " + cronograma);
				break;

			case 6:
				cronograma = "grátis!";
				System.out.println("Sábado " + cronograma);
				break;

			case 7:
				cronograma = "grátis!";
				System.out.println("Domingo " + cronograma);
				break;					

		}
	}

}