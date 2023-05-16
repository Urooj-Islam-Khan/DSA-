import java.util.Scanner;

public class BubbleSortAndBinarySearch {
    public static void main(String[] args) {

        int a[] = {124, 25, 130, 63, 49};
        int n = a.length;
        int start=0, mid = 0, end=n-1, i, k,c=0 ;
        Scanner sc = new Scanner(System.in);
       for (i = 0; i < a.length - 1; i++) {
            for (k = 0; k < a.length - i - 1; k++) {
                if (a[k] > a[k + 1]) {
                    int temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
            }
        }
        System.out.print("Sorted arry: \n{");
        for (i=0; i<a.length; i++)
        {
            System.out.print(a[i] + ",");
    }
        System.out.println("\b}");


        System.out.println("Enter item to find");
        int item = sc.nextInt();
        while (start<=end) {

                mid = (start + end) / 2;
                if (item == a[mid]) {

                    c++;
                    break;
                }
                else if (item > a[mid]) {
                    start = mid + 1;

                } else if (item < a[mid]) {
                    end = mid - 1;
                }}

            if(c>0){

                System.out.println("item found at " + mid);
            }
            else
                System.out.println("item not found");
}
        }