
public class QueueUrooj {

    static class QU{

        static int arr[];
        static int size;
        static int rear = -1;

        QU(int n){
            arr = new int[n];
            this.size = n;

        }
        public static boolean isEmpty()
        {
            return rear == -1;
        }

        public static void enqueue(int data){
            if(rear==size-1)
            {
                System.out.println("Queue is full...");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int dequeue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty...");
                return -1;

            }

            int front = arr[0];
            for (int i=0; i<rear; i++)
            {
                arr[i] = arr[i+1];

            }
            rear --;
            return front;
        }

        public static int front()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty...");
                return -1;

            }
            return arr[0];
        }


        public static void main(String arr[]){
             QU qu = new QU(5);

             qu.enqueue(0);
             qu.enqueue(1);
             qu.enqueue(2);
             qu.dequeue();
             qu.enqueue(4);

            while(!qu.isEmpty()){
                System.out.println(qu.front());
                qu.dequeue();
            }

        }

    }
}
