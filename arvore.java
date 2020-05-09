import java.util.*;

class arvore
{
    public static void main(String[] args)
    {
        int posi;
        int i2;
        int i;
        int j;
        int t;

        posi=6;
        t=1;

        for (i=0;i<=6;i++)
        {
            for (j=0;j<=10;j++)
            {
                if(j==posi)
                {
                    for (i2=0;i2<=t;i2++)
                    {
                        System.out.print('*');
                    }

                    t=t+2;
                    posi--;
                }

                else
                {
                    System.out.print(' ');
                }
                System.out.println("");
            }
        }
    }
}