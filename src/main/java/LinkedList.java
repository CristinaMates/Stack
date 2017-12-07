public class LinkedList {
    private Node first = null;

    public void insertFirst(int n) {
        Node nod = new Node(n);
        nod.next = first;
        first = n;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }
}

