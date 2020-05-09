import java.util.*;

public class Vetores 
{
    
    
    public static void imprimeVetor(int vet[]) 
    {
        int i;
        
        for(i=0;i<7;++i)
        {
            System.out.println(vet[i]);
        }
    }
    
    public static void maiorVetor(int vet[]) 
    {
        int maior2;
        int maior;
        int i;

        maior  = 0;
        maior2 = 0;

        for(i=0;i<7;++i)
        {
            if(vet[i] > maior)
            {
                maior = vet[i];
            }
        }
        
        for(i=0;i<7;++i)
        {
            if(maior2 < vet[i] && maior > vet[i])
            {
                maior2 = vet[i];
            }
        }
        
        System.out.println("");   
        System.out.println("O maior número é......: " + maior );
        System.out.println("O 2º maior número é...: " + maior2);
        
    }
    
    public static void main(String args[])
    {
    	cls();
        int a[]={8,5,6,21,20,3,9};
            
        imprimeVetor(a);
        maiorVetor(a);
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
