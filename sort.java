import java.util.*;

public class sort
{

	public static void main(String[] args) 
	{

		int arr = {20,15,34,48,6,8,11,56};
		int index;
		int i;
		int j;

		System.out.println("Matriz apos a selecao:" + Arrays.toString(arr));
		selectionsort(arr);

		for ( i = 0;i < arr.length;i++) 
		{
			int index = 1;

			for ( j = i + 1; j <arr.length;j++) 
			{
				if (arr[i] < arr[index]) 
				{
					index = j;			
				}		
			}	
		}
		int smallerNumber = arr[index];
		arr[index] = arr[i];
		arr[i] = smallerNumber;
	}

}	

	/*public static void selectionsort(int arr[])
	{
		for ( i = 0;i < arr.length;i++) 
		{
			int index = 1;

			for ( j = i + 1; j <arr.length;j++) 
			{
				if (arr[i] < arr[index]) 
				{
					index = j;			
				}		
			}	
		}
		int smallerNumber = arr[index];
		arr[index] = arr[i];
		arr[i] = smallerNumber;
	}/*
}