import java.util.Random;
import java.util.*;


public class sudoku 
{
	public static void main (String[]args) 
	{
		int[][] M = new int [10][10];
		boolean[][] P = new boolean [10][10];
		int numeroSorteado;
		int cont = 0;
		String saida = "";
		boolean permissao = true;
		Random Sorteio = new Random(); 
		
        M[1][1] = 5; M[1][2] = 3; M[1][5] = 7;
        M[2][1] = 6; M[2][4] = 1; M[2][5] = 9; M[2][6] = 5;
        M[3][2] = 9; M[3][3] = 8; M[3][8] = 6;
        M[4][1] = 8; M[4][5] = 6; M[4][9] = 3;
        M[5][1] = 4; M[5][4] = 8; M[5][6] = 3; M[5][9] = 1;
        M[6][1] = 7; M[6][5] = 2; M[6][9] = 6;
        M[7][2] = 6; M[7][7] = 2; M[7][8] = 8;
        M[8][4] = 4; M[4][5] = 1; M[4][6] = 9; M[8][9] = 5;
        M[9][5] = 8; M[9][8] = 7; M[9][9] = 9;
        
        
		
		for (int c = 1; c <= 9; c++) 
		{
			if (c != 1 && c != 2 && c != 5) 
			{
					
				numeroSorteado = Sorteio.nextInt(9) + 1;
				M[1][c] = numeroSorteado;
				
				for (int k = 1; k < c; k++) 
				{
					if (M[1][c] == M[1][k]) 
					{
						numeroSorteado = Sorteio.nextInt(9) + 1;
						M[1][c] = numeroSorteado;
						k = 0;
					}
				}
			}
		}
			
		for (int i = 2; i <= 9; i++) 
		{
			if (i != 1 && i != 2 && i != 4 && i != 5 && i != 6) 
			{
				numeroSorteado = Sorteio.nextInt(9) + 1;
				M[i][1] = numeroSorteado;
					
				for (int t = 1; t < i; t++) 
				{
					if (M[i][1] == M[t][1]) 
					{
						numeroSorteado = Sorteio.nextInt(9) + 1;
						M[i][1] = numeroSorteado;
						t = 0;
					}
				}
			}
		}
			
		for (int m = 2; m <= 9; m++) 
		{
			for (int n = 2; n <= 9; n++) 
			{
				if (M[m][n] != 0) 
				{
						
					do 
					{
						permissao = true;
						numeroSorteado = Sorteio.nextInt(9) + 1;
						M[m][n] = numeroSorteado;
						
						for (int f = 1; f < m; f++) 
						{
							if (M[m][n] == M[m][f]) 
							{
								permissao = false;
								break;
							}
						}
					
						for (int g = 1; g < n; g++) 
						{
							if (M[m][n] == M[g][n]) 
							{
								permissao = false;
								break;
							}
						}
					} while (permissao != true);
				}
			}
		}
			
		for (int h = 1; h <= 9; h++) 
		{
			for (int x = 1; x <= 9; x++) 
			{
				saida += (M[h][x] + "   ");
			}
			saida += ("\n");
		}
		System.out.print ("" + saida);
	}
}