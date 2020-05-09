import java.util.Random;

public class aulas 
{
    
    public static float calcularMedia(int aluno[]) 
    {
        return (aluno[0] + aluno[1]) / 2;
    }
    
    public static void exibirNotasEMedia(int numeroDoAluno, int[] aluno, float media)
    {
        System.out.println("Aluno " + numeroDoAluno);
        System.out.println("Nota B1 = " + aluno[0]);
        System.out.println("Nota B2 = " + aluno[1]);
        System.out.println("Média = " + media);
    }
    
    public static void exibirSeOAlunoReprovou(int numeroDoAluno, int[] aluno, float media) 
    {
        if (media <= 4) 
        {
            System.out.println("Aluno " + numeroDoAluno + " reprovado direto!");
        }

        else if(media > 4 && media < 7) 
        {
           exibirResultadoDaProvaDeRecuperacao(numeroDoAluno, aluno, media);
        }

        else if (media >= 7) 
        {
            System.out.println("Aluno " + numeroDoAluno + " passou de ano!");
        }

        else 
        {
            System.out.println("Aluno " + numeroDoAluno + " não passou de ano!");
        }
        System.out.println("-----------------------------------");
    }
    
    public static void exibirResultadoDaProvaDeRecuperacao(int numeroDoAluno, int[] aluno, float media) 
    {
        int notaDaProvaDeRecuperacao = retornarNotaAleatoria(10);
        System.out.println("Nota Recuperação = " + aluno[1]);

        if (media + notaDaProvaDeRecuperacao >= 10) 
        {
            System.out.println("Aluno " + numeroDoAluno + " passou de ano!");
        }

        else 
        {
            System.out.println("Aluno " + numeroDoAluno + " não passou de ano!");
        }
    }
    
    public static int retornarNotaAleatoria(int faixaDaNota) 
    {
        Random notasAleatorias = new Random();
        return notasAleatorias.nextInt(faixaDaNota);
    }
   
    public static void main(String[] args) 
    {
        cls();
         
        int alunos[][] = new int[15][2];  
        int numeroDoAluno = 1;
      
        for (int[] aluno : alunos) 
        {
            float media;
            aluno[0] = retornarNotaAleatoria(10);
            aluno[1] = retornarNotaAleatoria(10);
            media = calcularMedia(aluno);
            exibirNotasEMedia(numeroDoAluno, aluno, media);
            exibirSeOAlunoReprovou(numeroDoAluno, aluno, media);
            numeroDoAluno++;
        }
            
    }

    public static void cls() 
    {
        try 
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }

        catch (final Exception E) 
        {
            System.out.println(E);
        }
    }
}