public class BinarySearchDSAUni {
    public static void main(String[] args) {
        int[] data = {3,6,7,11,32,33,53};
        int low=0, mid;
        int high = data.length-1;
        int item = 32;
        int loc =-1;

        while(high>=low){

            mid = (low + high)/2;
            System.out.println("mid = " + mid);
            if(item==data[mid])
            {
             loc = mid;
                System.out.println("Item is found at location "+ loc);
                break;
            }
           else if (item <data[mid] ) {
            high = mid-1;
            System.out.println("High: " + high);
        }
            else if (item >data[mid]) {
                low = mid+1;
                System.out.println("Low: " + low);
            }
        }
        if(loc==-1)
            System.out.println(item +" is not found in the list" );

    }
}
