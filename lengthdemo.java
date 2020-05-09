import java.util.*;

public class lengthdemo
{
	public static void main(String[] args) 
	{
		cls();
		int table[][] = {{1, 2, 3},{4, 5},{6, 7, 8, 9}};
		int list[] = new int[10];
		int nums[] = {1, 2, 3};
		int i;	

		System.out.println("length da lista é: " + list.length);
		System.out.println("length dos números é: " + nums.length);
		System.out.println("length das tabelas é: " + table.length);
		System.out.println("length da tabela[0] é: " + table[0].length);
		System.out.println("length da tabela[1] é: " + table[1].length);
		System.out.println("length da tabela[2] é: " + table[2].length);
		System.out.println("");		

		for(i=0; i < list.length; i++)
		{
			list[i] = i * i;
		}
		System.out.print("Está é a lista: ");

		System.out.println("");	
		for (i=0; i < list.length; i++) 
		{
			System.out.print(list[i] + " ");	
		}
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