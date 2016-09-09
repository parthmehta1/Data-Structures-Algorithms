package radix_Sort_V2;
import java.util.Scanner;

public class RadixSort 
{
	public static void sort( int[] array)
	{
		int i, maximum = array[0], divisor = 1, numberOfItems = array.length;
		int[] store1 = new int[30];
		for (i = 1; i < numberOfItems; i++)
			if (array[i] > maximum)
			{
				maximum = array[i];
			}

		while (maximum / divisor > 0)
		{
			int[] store = new int[30];

			for (i = 0; i < numberOfItems; i++)
			{
				store[(array[i] / divisor) % 10]++;
			}
			for (i = 1; i < 10; i++)
			{
				store[i] += store[i - 1];
			}	
			for (i = numberOfItems - 1; i >= 0; i--)
			{
				store1[--store[(array[i] / divisor) % 10]] = array[i];
			}
			for (i = 0; i < numberOfItems; i++)
			{
				array[i] = store1[i];
			}
			divisor = divisor*10;        
		}
	}    

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );        

		int number, i;

		System.out.println("Enter the number of elements:");
		number = scan.nextInt();
		int arr[] = new int[ number ];
		System.out.println("\nEnter all the "+ number +" four digit elements:");
		for (i = 0; i < number; i++)
		{
			arr[i] = scan.nextInt();
		}
		sort(arr);
		System.out.println("\nThe numbers after sorting are:\n ");        
		for (i = 0; i < number; i++)
		{
			System.out.println(arr[i]+" ");            
		}
		System.out.println();                     
	} 

}
