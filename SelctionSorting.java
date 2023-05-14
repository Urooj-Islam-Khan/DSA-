public class SelctionSorting {
    public static void main(String[] args) {

        int[] a = {2,1,4,3,5,7,9,6,8,10};
        int min, temp;
        for (int i=0; i<a.length; i++)
        {
            min =  i;

            for (int j=i+1; j<a.length; j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }}
                temp = a[i];
                a[i]=a[min];
                a[min]=temp;
            }
            for (int i=0; i<a.length; i++){
            System.out.print(a[i]+ ",");}
        System.out.println("\b");

    }
}
