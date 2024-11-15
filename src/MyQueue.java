public class MyQueue<E> {
    private Node<E> head;
    private Node<E> tail;

    public MyQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public Node<E> dequeue() {
        if (head == null) {
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }
}
