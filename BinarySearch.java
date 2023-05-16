//binary search always applied on sorted data

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        /* step 1; to find mid = (big + end)/2   basically these are index */
        //complexity of binary search is k = log2n
        // step 2; if (a[mid] = item),return
        // step 3; if(item>a[mid] , beg = mid + 1, go to step 1
        // step 3; if(item<a[mid] , end = mid - 1, go to step 1
        Scanner sc = new Scanner(System.in);
        int n, i, c=0, item;
        int[] a;                    //declaring an aaray
        System.out.println("how many elements do you want to enter ");
        n = sc.nextInt();   // num of elements in array

        a = new int[n];     //initializing an array

        System.out.println("Enter elements");

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter item to find");
        item = sc.nextInt();

        int mid=0, beg = 0, end = n - 1;
        while (beg <= end) {

            mid = (beg + end) / 2;
            if (item == a[mid]) {

                c++;
                break;
            } else if (item > a[mid]) {
                beg = mid + 1;

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