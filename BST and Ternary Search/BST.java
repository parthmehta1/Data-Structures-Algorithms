
import java.util.Scanner;

public class BST {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int a[]= new int[100];

		int k=1;

		while(true)
		{
			System.out.println("\nEnter the elements of the tree");
			for(i=1;i<32;i++)
			{
				a[i] = scan.nextInt();
			}
			int count=0;
			for(k=1;k<16;k++)
			{
				if(a[k]<a[2*k+1] && a[k]>a[2*k])
				{

				}
				else
				{
					if(a[k]==-1 || a[2*k]==-1 || a[2*k+1]==-1)
					{

					}
					else
					{
						count=1;
					}

				}
			}

			if(count==0)
			{
				System.out.println("The tree entered is BST");
			}
			else
			{
				System.out.println("The tree entered is not BST");
			}
		}
	}
}

