public class Sphere1
{
	public static void main(String[] args) 
	{
		cls();
		Sphere mySphere = new Sphere();
		mySphere.determineSphereVolume();	
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