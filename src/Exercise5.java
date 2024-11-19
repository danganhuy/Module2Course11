public class Exercise5 {
    public static void main(String[] args) {
        MyQueue2<Integer> queue = new MyQueue2<>(10);
        queue.enqueue(10);
        queue.enqueue(32);
        queue.enqueue(11);
        queue.enqueue(96);
        queue.enqueue(72);
        queue.enqueue(65);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(91);
        queue.enqueue(110);
        queue.enqueue(120);
        queue.enqueue(130);
        queue.dequeue();
        queue.dequeue();
    }
}
