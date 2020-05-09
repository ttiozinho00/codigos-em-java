public class tabela
{
	public static void main(String[] args) 
	{
		boolean[][] bool = new boolean[5][5];
		int v;
		int f;

		for(v = 0; v < bool.length; v++)
		{
			for(f = 0; f < bool[v].length; f++)
			{
				bool[v][f] = (v == f)? true : bool[v][f];
			}
		}
		System.out.printf("%i",bool);	
	}
}