
public class HeapSortAlgorithm
{
    public static int[] a;
    public static int   n;
    public static int   max;
 
    public static void makeHeap(int[] a)
    {
        n = a.length - 1;
        for (int i = n / 2; i >= 0; i--)
        {
            checkHeapProperty(a, i);
        }
    }
 
    public static void checkHeapProperty(int[] a, int i)
    {
      
        if (2*i <= n && a[2*i] > a[i])
        {
            max = 2*i;
        } 
        else
        {
            max = i;
        }
 
        if (2*i +1 <= n && a[2*i+1] > a[max])
        {
            max = 2*i+1;
        }
        if (max != i)
        {
            swap(i, max);
            checkHeapProperty(a, max);
        }
    }
 
    public static void swap(int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
 
    public static void sort(int[] a0)
    {
        a = a0;
        makeHeap(a);
 
        for (int i = n; i > 0; i--)
        {
            swap(0, i);
            n = n - 1;
            checkHeapProperty(a, 0);
        }
    }
 
    public static void main(String[] args)
    {
        int k;
        int[] sequence = new int[] {10,20,40,70,5,30,25,23,100,210,200,99,1,6,33,14,55,23,66,89};
 
        System.out.println("The Entered elements of array are:");
        for (k=0;k < sequence.length;k++)
        {
        	System.out.println(+sequence[k]);
        }
        sort(sequence);
 
        System.out.println("\nThe sorted sequence is: ");
        for (int i = 0; i<sequence.length; i++)
            System.out.print(sequence[i] + " ");
    }
}