import java.util.Random;

public class dado
{
	public static void main(String[] args) 
	{
		Random randomnum = new Random();

		int lado1;
		int lado2;
		int lado3;
		int lado4;
		int lado5;
		int lado6;
		int face;
		int roll;

		lado1 = 0;
		lado2 = 0;
		lado3 = 0;
		lado4 = 0;
		lado5 = 0;
		lado6 = 0;

		cls();

		for (roll = 0;roll <= 6000;roll++) 
		{
			face = 1 + randomnum.nextInt(6);

			switch(face)
			{
				case 1:
				++lado1;
				break;

				case 2:
				++lado2;
				break;	

				case 3:
				++lado3;
				break;	

				case 4:
				++lado4;
				break;	

				case 5:
				++lado5;
				break;	

				case 6:
				++lado6;
				break;		
			}	
		}
		System.out.println("Face\tLado");
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n",lado1,lado2,lado3,lado4,lado5,lado6);		
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