public class InsertionSorting
{
    public static void main(String[] args)
    {
    int[] a = {2,4,6,8,10,1,3,5,7,9};
    int temp, j;
    for(int i=1; i< a.length; i++)
    {
        temp = a[i];
        j = i;
        while(j>0 && a[j-1]>temp)
        {
            a[j] = a[j-1];
            j = j-1;
        }
        a[j] = temp;
    }
        System.out.print("\nSorted Array : { ");
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print("\b }");
    }
}