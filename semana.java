public class semana 
{
    public static void main(String[] args) 
    {
        cls();

        final int DIAS_NA_SEMANA = 7;
        final String[] diasDaSemana = { "Domingo", "Segunda", "Terca","Quarta", "Quinta", "Sexta", "Sabado" };

        if (args.length != 1) 
        {
            System.err.println("Sintaxe: Dia numero");
            System.exit(1);
        }

        int dia = Integer.parseInt(args[0]);

        if (dia < 1 || dia > DIAS_NA_SEMANA) 
        {
            System.err.println("O dia da semana deve estar entre 1 e " + DIAS_NA_SEMANA);
            System.exit(1);
        }
        System.out.println(diasDaSemana[dia]);
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