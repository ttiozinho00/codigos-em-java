public class Vetor
{
	public static void main(String[] args) 
	{
		cls();

		int vetor[] = new int[3];

		vetor[0] = 0; 
		vetor[1] = 10;
		vetor[2] = 20;

		System.out.println(vetor[0] + " " + vetor[1] + " " + vetor[2] + " ");		
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