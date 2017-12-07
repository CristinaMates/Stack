public class LinkedListStack {
    public class LinkListStack {

        LinkedList li = new LinkedList();

        public void push(int n) {
            li.insertFirst(n);
        }

        public void pop() {
            while(!li.isEmpty()){
                li.deleteFirst();
            }
        }

        public void displayStack() {
            System.out.println("  ");
            li.displayList();
        }
    }
}
