import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, item, c=0;
        int[] a;                    //declaring an aaray

        System.out.println(" how many elements do you want to enter ");
        n = sc.nextInt();   // num of elements in array

        a = new int[n];     // initializing an array

        System.out.println("Enter elements");

        for( i = 0; i < n; i++)

        {a[i] = sc.nextInt();}

        System.out.println("Enter item to find");
        item = sc.nextInt();
  for ( i=0; i<a.length; i++)
            if (a[i] == item)
            {
                c++;
                break;
                }

        if(c>0)
        {System.out.println("Item exist at " + i);}

        else
        {
            System.out.println("Item is not exist");
        }
    }
}