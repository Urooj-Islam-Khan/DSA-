import java.util.Scanner;

public class BubbleSortInput
{
    public static void main(String[] args)
    {
        int n, i, temp, k;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements");
        n = sc.nextInt();
        System.out.println("Ente elements of array");
        a = new int[n];
    for (i=0; i < n; i++)
    {
        a[i] = sc.nextInt();
    }

        for (i=0; i < n-1; i++)
        {
            for (k=0; k<n-i-1; k++)
            {
                if (a[k] > a[k+1]) {
                    temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
            }
        }
                System.out.print("Sorted Array\n {");
                for (i=0; i < n; i++) {
                    System.out.print(a[i] + ",");
                }
        System.out.print("\b}");

    }

        }

