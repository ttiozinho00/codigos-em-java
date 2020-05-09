//package com.deitel.jhtp.ch08.relogio;
import java.util.*;

public class relogio1
{
	public static void main(String[] args) 
	{
		cls();

		relogio time = new relogio();

		System.out.print("O hor�rio Universal � de: ");	
		System.out.println(time.toUniversalString());

		System.out.print("O hor�rio Local � de: ");	
		System.out.println(time.toString());
		System.out.println("");

		time.setTime(13, 27,6);
		System.out.print("O hor�rio Universal depois de ser alterado: ");
		System.out.println(time.toUniversalString());

		System.out.print("O hor�rio Local depois de ser alterado: ");	
		System.out.println(time.toString());
		System.out.println("");

		time.setTime(99, 99,99);
		System.out.println("Depois do valor inv�lido na cofigura��o:");

		System.out.print("O hor�rio Universal: ");	
		System.out.println(time.toUniversalString());

		System.out.print("O hor�rio Local: ");	
		System.out.println(time.toString());
		System.out.println("");
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