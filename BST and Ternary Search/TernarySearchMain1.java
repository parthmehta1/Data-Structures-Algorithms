
import java.util.Scanner;

public class TernarySearchMain1 {

	public static void main(String[] args) {
		int lowIndex = 0;
		int highIndex;
		TernarySearchLogic1 search = new TernarySearchLogic1();
		int array[] = new int[50];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of an array:\n");
		int length = scan.nextInt();
		System.out.println("Enter the elements of an array:\n");
		for(int i = 0; i<length;i++)
		{
			array[i] = scan.nextInt();
		}
		highIndex = length;
		System.out.println("1. Example of array element in First position:");
		search.binSearch(array, lowIndex, highIndex, 44); 
		System.out.println("**************************************************");
		
		System.out.println("2. Example of array element in middle of the array:");
		search.binSearch(array, lowIndex, highIndex, 50);
		
		System.out.println("**************************************************");
		System.out.println("3. Example of array element at last of array:");
		search.binSearch(array, lowIndex, highIndex, 70);
		
		System.out.println("**************************************************");
		System.out.println("4. Example of array element not present in the given array:");
		search.binSearch(array, lowIndex, highIndex, 9);
		
		
	}

}

class TernarySearchLogic1 
{
	
	int midIndex1;
	int midIndex2;
	
	int a[] = new int[50] ;

	public void binSearch(int a[],int lowIndex ,int highIndex, int searchValue)
	{
		
		if(lowIndex>highIndex)
		{
			System.out.println("The entered element " +searchValue+ " is not found in the array");
		}
		
		else
		{
		
		midIndex1 =((highIndex+lowIndex)/3);
		midIndex2 = 2*((highIndex+lowIndex)/3);
		if (a[midIndex1] == searchValue)
		{
			System.out.println("The entered element " +searchValue+ " is found at " +(midIndex1+1) + " position of an array.");
		
		}
		
		else if(a[midIndex2] == searchValue)
		{
			System.out.println("The entered element "+searchValue+ " is found at " +(midIndex2+1) + " position of an array.");
			
		}
		
		else if(a[midIndex1]>searchValue)
		{
			highIndex = midIndex1-1;
			binSearch(a,lowIndex,highIndex,searchValue);
		}
		
		
		else if(a[midIndex2] < searchValue)
		{
			lowIndex = midIndex2+1;
			binSearch(a, lowIndex,highIndex,searchValue);
		}
		
		else
		{
			binSearch(a, midIndex1,midIndex2,searchValue);
		}
		

	}
}
}