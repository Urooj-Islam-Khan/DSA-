public class BubbleSort
{
    public static void main(String[] args)
    {
        int k, i, temp;
        int[] a = {54,23,78,11,66,90,87};
      int n= a.length;
        System.out.print("Given Array \n{");
        for (i=0; i< a.length; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.println("\b}");

    int flag=0;
    for (i=0; i<n; i++) // for round
    {
        for (k=0; k < n-i-1; k++)   // for passes
            {
                if (a[k] > a[k + 1])
                {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                    flag=1;
                }
            }
        if(flag==0)
        {break;}
    }
    System.out.print("Sorted Array \n" + "{");
        for (i=0; i<n; i++){
            System.out.print(a[i] + ",");
        }
        System.out.print("\b}");
    }
}