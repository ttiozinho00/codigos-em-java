import java.util.ArrayList;

public class collection
{
	public static void main(String[] args) 
	{
		cls();
		
		ArrayList<String> items = new ArrayList<String>();

		items.add("red");
		items.add(0,"yellow");

		System.out.print("Display list contents counter-controlled loop: ");

		for (int i = 0; i < items.size(); i++) 
		{		
			System.out.printf(" %s",items.get(i));			
		}

		display(items,"\nDisplay list contents with enhanced for statements: ");

		items.add("green");
		items.add("yellow");
		display(items,"List with two new elements: ");

		items.remove("yellow");	
		display(items,"Remove firsts instance of yellow: ");

		items.remove(1);
		display(items,"Remove second list element (green):");

		System.out.printf("\"red\" is %s in the list\n",items.contains("red") ? "" : "not ");
		System.out.printf("Size: %s\n", items.size());
	}

	public static void display(ArrayList<String> items, String header)
	{
		System.out.print(header);

		for (String item : items) 
		{
			System.out.printf(" %s",item);			
		}
		System.out.println("");	
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