

    public class LinkedListUNI {

        static class Node {

            // reference to the next node in the chain, or null if there //isn't one.
            Node next;

// data carried by this node. could be of any type you need.

            Object data;

            // Node constructor
            public Node(Object dataValue)
            {
                next = null;
                data = dataValue;
            }


            public Object getData() {
                return data;
            }


            public void setData(Object dataValue) {
                data = dataValue;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node nextValue) {
                next = nextValue;
            }

        }

        public static void main(String[] args) {

            Node next;

            Node node1 = new Node("A");
            next = node1;
            Node node2 = new Node("B");
            node1.setNext(node2);
            Node node3 = new Node("C");
            node2.setNext(node3);
            Node node4 = new Node("D");
            node3.setNext(node4);

            //*** For deletion of node
        /*node1.next = node2.next;
        node2 = null;

        //*** For addition of node
        Node node5 = new Node("Z");
        node5.setNext(node1.getNext());
        node1.setNext(node5);
*/

            while (next != null) {
                System.out.println(next.getData());
                next = next.getNext();

            }
        }
    }