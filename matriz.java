class matriz
{
	public static void main(String[] args)
	{
		cls();
		int [][]matriz = new int[2][3];
		for(int i=0; i< matriz.length; i++)
		{
			System.out.println("Linha: "+i);

			for(int j=0; j< matriz[i].length; j++)
			{
				matriz[i][j]= i+1;
				System.out.println("Valores da coluna");
				System.out.println(matriz[i][j]);
			}
		}
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