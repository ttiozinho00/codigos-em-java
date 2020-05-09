import static com.mtsystems.coot.String8.cs8;
import com.mtsystems.coot.NativeHelper;
import com.mtsystems.coot.NativeHelper;
import static include.Stdio.snprintf;
import static include.String.strstr;
import com.mtsystems.coot.String8;
import com.mtsystems.coot.String8;
import com.mtsystems.coot.String8;
import com.sun.jna.Library;
import java.util.Scanner;

public class Stdio 
{
    private static interface IndirectMappings extends Library 
    {
        int snprintf(String8 s, long maxlen_U, String8 format, Object... varargs);
    }

    private final static IndirectMappings INDIRECT_MAPPINGS;

    static 
    {
        NativeHelper h = NativeHelper.get("libc.so.6");
        INDIRECT_MAPPINGS = h.bindIndirect(IndirectMappings.class);
    }

    public static int snprintf(String8 s, long maxlen_U, String8 format, Object... varargs) 
    {
        return INDIRECT_MAPPINGS.snprintf(s, maxlen_U, format, varargs);
    }
}

public class String 
{
    static 
    {
        NativeHelper h = NativeHelper.get("libc.so.6");
        h.bindDirect(String.class);
    }

    public static native String8 strstr(String8 haystack, String8 needle);
}

public class apocaliptico 
{
    public static void main(String[] args) 
    {
        Scanner leitura = new Scanner(System.in);

        double result;
        String8 output = new String8(500);
        String8 ret;

        for(int num = 970; num <= 970; num++) 
        {
            System.out.print("Informe o valor:");
            num = leitura.nextInt();

            result = Math.pow(2, num);
            snprintf(output, 500, cs8("%.500g"), result);
            System.out.print("DIGITOS: " + output.length() + "\n\n ");

            if((ret = strstr(output, cs8("666"))) != null) 
            {
                System.out.println("NÚMERO: " + output + "\n\n");
                System.out.println("LOCAL: " + ret + "\n\n");
                System.out.println("NUM: " + num);
                System.out.println("");
            }

            else 
            {
                System.out.println("Não apocalíptico");
                System.out.println("");
            }
        }
    }
}