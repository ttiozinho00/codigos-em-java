import java.util.Scanner;
import java.util.*;

public class apocaliptico
{

    public static void main(String[]args)
    { 
        cls();
        Scanner leitura = newScanner(System.in);

        int num;
        double result;
        char output[] = new char[500];
        char ret;
        
        for(num=970;num<=970;num++)
        {
            System.out.printf("Informe o valor:");
            num = leitura.nextInt();
            
            
            result=Math.pow(2,num);
            System.out.printf(output, 500, "%.500g", result);
            System.out.printf("DIGITOS: "+output+"\n\n ",(int) strlen(output));

            if((ret=strstr(output,"666"))!=NULL)
            {
                System.out.printf("NÚMERO: "+ output +"\n\n\n"/*, output*/);
                System.out.printf("LOCAL: "+ ret +"\n\n\n"/*, ret*/);
                System.out.printf("NUM: "+num+"\n"/*, num*/);
                System.out.printf("\n");
            }
            
            else
            {
                System.out.printf("Não apocalíptico\n");
                System.out.printf("");
            }
        }

        System.exit(0);
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