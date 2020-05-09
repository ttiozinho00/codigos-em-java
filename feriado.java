import java.util.*;

public class feriado
{
	public static void main(String[] args) 
	{

		int diaDaSemana = 5;
		boolean feriado = true;

        if((diaDaSemana >= 1 && diaDaSemana <= 5) || !feriado) 
        {
            System.out.println("Acordei as 7:00");
        }

        else if((diaDaSemana >= 6 && diaDaSemana <= 10) && feriado) 
        {
            System.out.println("Dormir!");   
        }

		else if((diaDaSemana >= 11 && diaDaSemana <= 15) || !feriado) 
		{
         	System.out.println("Acordei as 7:00");
    	}

     	else if((diaDaSemana >= 16 && diaDaSemana <= 20) || !feriado)  
     	{
     		System.out.println("Acordei as 7:00");
     	}

     	else if((diaDaSemana >= 21 && diaDaSemana <= 25) || !feriado) 
     	{
         	System.out.println("Acordei as 7:00");
     	}

     	else if((diaDaSemana >= 26 && diaDaSemana <= 31) || !feriado) 
     	{
     		System.out.println("Acordei as 7:00");
     	}
	}
}