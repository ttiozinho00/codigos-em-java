import java.util.*;

public class logico
{
	public static void main(String[] args) 
	{
		cls();
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","Condicional E (&&)","false && false",(false && false),"false && true",(false && true),"true && false",(true && false),"true && true",(true && true));
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","Condicional OU (||)","false || false",(false || false),"false || true",(false || true),"true || false",(true || false),"true || true",(true || true));
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","Condicional l�gica Boleana E (&)","false & false",(false & false),"false & true",(false & true),"true & false",(true & false),"true & true",(true & true));	
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","Condicional l�gica Boleana incrusiva OU (|)","false | false",(false | false),"false | true",(false | true),"true | false",(true | false),"true | true",(true | true));
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","Condicional L�gica Boleana exclusiva OU (^)","false ^ false",(false ^ false),"false ^ true",(false ^ true),"true ^ false",(true ^ false),"true ^ true",(true ^ true));
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